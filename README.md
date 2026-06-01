# Task 3: Contact Management Dashboard with Spring Boot & JavaScript Fetch API

This repository contains the implementation for **Task 3** of the Java Full Stack Web Development Internship at **Maincrafts Technology**. Building on the data persistence layer completed in Task 2, this milestone introduces an admin-facing dashboard that dynamically retrieves and visualizes contact form data.

## 🚀 Project Overview
The primary goal of this task is to bridge the gap between frontend and backend systems using REST API concepts. The application exposes an endpoint that delivers records from a MySQL database as a JSON array, which is then parsed dynamically by JavaScript on the frontend and displayed in a clean, responsive HTML table.

---

## 🛠️ Tech Stack
- **Frontend:** HTML5, CSS3, JavaScript (Fetch API)
- **Backend:** Java 21, Spring Boot (Web, Data JPA)
- **Database:** MySQL
- **Build Tool:** Maven

---

## ✨ Core Features
- **RESTful API Consumption:** Uses the native JavaScript `fetch()` API to asynchronously request data from the backend.
- **Dynamic DOM Manipulation:** Parses JSON response payloads on the fly and structurally injects rows into an HTML data table.
- **Asynchronous Data Refresh:** Includes a manual refresh feature allowing administrators to poll the database for new logs without reloading the entire page.
- **Security Guardrails:** Form fields utilize basic contextual escaping to prevent Cross-Site Scripting (XSS) injections from malformed user feedback inputs.

---

## 📂 Project Architecture & Setup
To review or run the application, make sure your files are organized within the standard Spring Boot project layout:

    src/main/resources/static/
    ├── index.html       # Public-facing user submission form (From Task 1 & 2)
    └── dashboard.html   # Admin-facing contact management layout table (New in Task 3)

## Pre-requisites & Database Setup
Ensure your local MySQL service is running with the proper tracking schema active:
1. Pre-requisites & Database Setup
   Ensure your local MySQL service is running with the proper tracking schema active:
   ```sql
   CREATE DATABASE maincrafts_db;
2. Confirm your credentials match inside src/main/resources/application.properties:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/maincrafts_db?useSSL=false&serverTimezone=UTC
   spring.datasource.username=YOUR_MYSQL_USERNAME
   spring.datasource.password=YOUR_MYSQL_PASSWORD
   spring.jpa.hibernate.ddl-auto=update

## How to Run and Test
1. Launch the Server
   Import the workspace folder as a Maven project inside IntelliJ IDEA or VS Code. Run DemoApplication.java or initialize via your terminal:
   ```
   ./mvnw spring-boot:run
   
2. Generate Test Influx
   Open http://localhost:8080/index.html in your web browser. Fill out the contact fields and click Send Message to populate rows into your local database.

3. Open the Admin Panel
   Open a separate browser tab and navigate to the dashboard interface view:
   ```
   http://localhost:8080/dashboard.html
  The page will automatically fire a GET request using the Fetch API, process the JSON data from your database, and display it cleanly inside the table matrix.      Click 🔄 Refresh List to test instant system data-syncing.
