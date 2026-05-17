package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*") // Allows your frontend to connect seamlessly
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    // 1. Modified POST Endpoint: Saves incoming frontend data to MySQL
    @PostMapping("/submit-form")
    public String handleForm(@RequestBody ContactForm form) {
        // Save the form entity directly into the database
        contactRepository.save(form);

        System.out.println("Form submission successfully saved to MySQL database!");
        return "Success! Your response has been saved securely to the database.";
    }

    // 2. New GET Endpoint: Required by Task 2 to view all entries as JSON
    @GetMapping("/contacts")
    public List<ContactForm> getAllContacts() {
        return contactRepository.findAll();
    }
}