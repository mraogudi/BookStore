package com.example.bookstore.services;

import com.example.bookstore.model.BookStoreEntity;
import com.example.bookstore.repositories.BookStoreRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookStoreService {

    @Autowired
    private BookStoreRepository bookStoreRepository;
    public List<BookStoreEntity> getAllBooks() {
        log.debug("Getting all books");
        return bookStoreRepository.getAllBooks();
    }

    public BookStoreEntity getBookById(String id) {
        log.debug("Getting book by id :: "+id);
        return bookStoreRepository.getBookIdById(id);
    }

    public int addBook(BookStoreEntity bookStore) {
        if (bookStore.getId() == null) {
            log.debug("Adding new book");
            int count = bookStoreRepository.getCount();
            bookStore.setId(count + 1);
            return bookStoreRepository.addBook(bookStore);
        } else {
            log.debug("In add() Updating existing book");
            return bookStoreRepository.updateBook(bookStore);
        }
    }

    public int updateBook(BookStoreEntity bookStore, String id) {
        log.debug("Updating existing book");
        bookStore.setId(Integer.parseInt(id));
        return bookStoreRepository.updateBook(bookStore);
    }

    public int deleteBook(String id) {
        log.debug("Deleting book:: "+id);
        return bookStoreRepository.deleteBook(id);
    }
}
