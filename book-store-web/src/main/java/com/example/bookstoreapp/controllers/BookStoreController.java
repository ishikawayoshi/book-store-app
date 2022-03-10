package com.example.bookstoreapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping("/api/v1/books")
public class BookStoreController {

    @GetMapping
    public ResponseEntity<String> getSimpleResponse(){
        return new ResponseEntity<>("OK",HttpStatus.OK);
    }
    
}
