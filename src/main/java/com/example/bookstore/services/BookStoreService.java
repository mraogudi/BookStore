package com.example.bookstore.services;

import com.example.bookstore.model.BookStoreEntity;
import com.example.bookstore.repositories.BookStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookStoreService {

    @Autowired
    private BookStoreRepository bookStoreRepository;
    public List<BookStoreEntity> getAllBooks() {
        return bookStoreRepository.getAllBooks();
    }

    public BookStoreEntity getBookById(String id) {
        return bookStoreRepository.getBookIdById(id);
    }

    public int addBook(BookStoreEntity bookStore) {
        int count = bookStoreRepository.getCount();
        bookStore.setId(count + 1);
        return bookStoreRepository.addBook(bookStore);
    }

    public int updateBook(BookStoreEntity bookStore, String id) {
        bookStore.setId(Integer.parseInt(id));
        return bookStoreRepository.addBook(bookStore);
    }

    public int deleteBook(String id) {
        return bookStoreRepository.deleteBook(id);
    }
}
