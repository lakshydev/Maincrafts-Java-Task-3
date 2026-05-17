package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "contacts") // This creates a table named 'contacts' in MySQL
public class ContactForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatically increments the ID (1, 2, 3...)
    private Long id;

    private String name;
    private String email;

    @Column(columnDefinition = "TEXT") // Allows longer message entries
    private String message;

    // Default Constructor (Required by JPA)
    public ContactForm() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}