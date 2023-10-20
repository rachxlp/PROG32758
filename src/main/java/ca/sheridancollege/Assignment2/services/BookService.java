/*
 * Name:  Rachel Prasad
 * Student ID: 991702269
 * Assignment:  Assignment 3
 * Program: Computer Systems and Network Engineering (Co-op)
 */

package ca.sheridancollege.Assignment2.services;

import ca.sheridancollege.Assignment2.beans.Book;
import ca.sheridancollege.Assignment2.database.DatabaseAccess;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

private DatabaseAccess database;
    public BookService(DatabaseAccess database) {
        this.database = database;
    }

    public List<Book> getAllBooks() {
        return database.getAllBooks();
    }

    public void addBook(Book book) {
        database.addBook(book);
    }

    public void deleteBook(long id) {
        database.deleteBook(id);
    }

}
