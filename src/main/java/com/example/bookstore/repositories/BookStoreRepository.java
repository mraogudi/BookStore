package com.example.bookstore.repositories;

import com.example.bookstore.model.BookStoreEntity;
import com.example.bookstore.utils.DataRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookStoreRepository {
    private JdbcTemplate jdbcTemplate;

    public List<BookStoreEntity> getAllBooks() {
        return jdbcTemplate.query("select * from bookstore", new DataRowMapper());
    }

    public int getCount() {
        return jdbcTemplate.queryForObject("select count(*) from bookstore", Integer.class);
    }

    public BookStoreEntity getBookIdById(String id) {
        return jdbcTemplate.queryForObject(
                "select * from bookstore where id = ?",
                new Object[] { id }, new DataRowMapper());
    }

    public int addBook(BookStoreEntity bookStore) {
        String query = "insert into bookstore (id, name, price, author, short_desc) " +
                "values (?, ?, ?, ?, ?)";
        return jdbcTemplate.update(query, bookStore.getId(), bookStore.getName(),
                bookStore.getPrice(), bookStore.getAuthor(), bookStore.getShortDesc());
    }

    public int deleteBook(String id) {
        String query = "delete from bookstore where id = ?";
        return jdbcTemplate.update(query, id);
    }
}
