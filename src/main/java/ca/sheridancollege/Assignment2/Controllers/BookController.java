/*
 * Name:  Rachel Prasad
 * Student ID: 991702269
 * Assignment:  Assignment 3
 * Program: Computer Systems and Network Engineering (Co-op)
 */

package ca.sheridancollege.Assignment2.Controllers;

import ca.sheridancollege.Assignment2.beans.Book;
import ca.sheridancollege.Assignment2.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService)
    {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String goHome(Model model, @ModelAttribute Book book) {
        List<Book> bookList = bookService.getAllBooks();
        model.addAttribute("bookList", bookList);
        return "index";
    }

    @PostMapping("/addBook")
    public String addBook(@ModelAttribute Book book) {
        bookService.addBook(book);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable long id) {
        bookService.deleteBook(id);
        return "redirect:/";
    }
}