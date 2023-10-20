/*
 * Name:  Rachel Prasad
 * Student ID: 991702269
 * Assignment:  Assignment 3
 * Program: Computer Systems and Network Engineering (Co-op)
 */

package ca.sheridancollege.Assignment2.database;

import ca.sheridancollege.Assignment2.beans.Book;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DatabaseAccess {
    private NamedParameterJdbcTemplate jdbc;

    public DatabaseAccess(NamedParameterJdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<Book> getAllBooks() {
        String query = "SELECT * FROM books";
        return jdbc.query(query, new BeanPropertyRowMapper<>(Book.class));
    }

    public int addBook(Book book) {
        String query = "INSERT INTO books (BOOKISBNNAME, BOOKNAME, AUTHORNAME, ROLE) VALUES " +
                "(:bookISBNName, :bookName, :authorName, :role)";


        MapSqlParameterSource namedParameters = new MapSqlParameterSource()
                .addValue("bookISBNName", book.getBookISBNName())
                .addValue("bookName", book.getBookName())
                .addValue("authorName", book.getAuthorName())
                .addValue("role", book.getRole());

        int returnValue = jdbc.update(query, namedParameters);
        return returnValue;
    }

    public int deleteBook(long id) {
        String query = "DELETE FROM books WHERE id = :id";
        MapSqlParameterSource namedParameters = new MapSqlParameterSource()
                .addValue("id", id);

        return jdbc.update(query, namedParameters);
    }
}
