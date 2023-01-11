package com.example.bookstore.controllers;

import com.example.bookstore.model.BookStoreEntity;
import com.example.bookstore.services.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bookstore")
@CrossOrigin("http://localhost:4200")
public class BookStoreController {
    @Autowired
    private BookStoreService bookStoreService;
    @GetMapping("/all")
    public ResponseEntity<List<BookStoreEntity>> getAllBooks() {
        return new ResponseEntity<>(bookStoreService.getAllBooks(), HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<BookStoreEntity> getBookById(@RequestParam String id) {
        return new ResponseEntity<>(bookStoreService.getBookById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Integer> addBook(@RequestBody BookStoreEntity bookStore) {
        return new ResponseEntity<>(bookStoreService.addBook(bookStore), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Integer> updateBook(@PathVariable String id, @RequestBody BookStoreEntity bookStore) {
        return new ResponseEntity<>(bookStoreService.updateBook(bookStore, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Integer> deleteBook(@PathVariable String id) {
        return new ResponseEntity<>(bookStoreService.deleteBook(id), HttpStatus.OK);
    }
}
