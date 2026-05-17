package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface ContactRepository extends JpaRepository<ContactForm, Long> {
        // This empty interface inherits standard methods like .save() and .findAll()
    }


