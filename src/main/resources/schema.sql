/*
 * Name:  Rachel Prasad
 * Student ID: 991702269
 * Assignment:  Assignment 3
 * Program: Computer Systems and Network Engineering (Co-op)
 */

CREATE TABLE books (
    id LONG AUTO_INCREMENT PRIMARY KEY,
    bookISBNName VARCHAR(50),
    bookName VARCHAR(50),
    authorName VARCHAR(50),
    role VARCHAR(50),
    creationDate datetime DEFAULT CURRENT_TIMESTAMP
);