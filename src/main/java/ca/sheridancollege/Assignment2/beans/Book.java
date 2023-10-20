/*
 * Name:  Rachel Prasad
 * Student ID: 991702269
 * Assignment:  Assignment 3
 * Program: Computer Systems and Network Engineering (Co-op)
 */

package ca.sheridancollege.Assignment2.beans;

import lombok.Data;
import java.util.Date;

@Data
public class Book {
    private Long id;
    private String bookISBNName;
    private String bookName;
    private String authorName;
    private String role;
    private Date creationDate;
}