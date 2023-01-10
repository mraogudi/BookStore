package com.example.bookstore.utils;

import com.example.bookstore.model.BookStoreEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataRowMapper implements RowMapper<BookStoreEntity> {
    @Override
    public BookStoreEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
