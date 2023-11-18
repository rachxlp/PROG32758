/*
 * Name:  Rachel Prasad
 * Student ID: 991702269
 * Assignment:  Exercise 5 - Messages
 * Program: Computer Systems and Network Engineering (Co-op)
 */

package ca.sheridancollege.prasadra.exercise5.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

public class Message {
    public int id;
    public String message;
}
