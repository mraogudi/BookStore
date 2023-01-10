package com.example.bookstore.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

@Setter
@Getter
@NoArgsConstructor
@JsonInclude(ALWAYS)
public class BookStoreEntity {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("price")
    private String price;
    @JsonProperty("shortDesc")
    private String shortDesc;
    @JsonProperty("author")
    private String author;
}
