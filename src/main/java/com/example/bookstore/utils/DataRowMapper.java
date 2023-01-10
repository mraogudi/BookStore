package com.example.bookstore.utils;

import com.example.bookstore.model.BookStoreEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataRowMapper implements RowMapper<BookStoreEntity> {
    @Override
    public BookStoreEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        BookStoreEntity entity = new BookStoreEntity();
        entity.setId(resultSet.getInt("id"));
        entity.setName(resultSet.getString("name"));
        entity.setAuthor(resultSet.getString("author"));
        entity.setPrice(resultSet.getString("price"));
        entity.setShortDesc(resultSet.getString("short_desc"));
        return entity;
    }
}
