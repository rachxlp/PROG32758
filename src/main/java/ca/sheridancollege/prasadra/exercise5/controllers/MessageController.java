/*
 * Name:  Rachel Prasad
 * Student ID: 991702269
 * Assignment:  Exercise 5 - Messages
 * Program: Computer Systems and Network Engineering (Co-op)
 */

package ca.sheridancollege.prasadra.exercise5.controllers;

import ca.sheridancollege.prasadra.exercise5.beans.Message;
import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MessageController {
    @GetMapping("/")
    public String goHome(@ModelAttribute Message message, Model model, HttpSession session) {
        List<Message> messages;
        if (session.isNew()) {
            messages = new ArrayList<Message>();
        } else {
            messages = (List<Message>) session.getAttribute("messageList");
        }
        session.setAttribute("messageList", messages);
        model.addAttribute("message", new Message());
        return "index";
    }

    @PostMapping("/saveMessage")
    public String saveMessage(@ModelAttribute Message message, HttpSession session, Model model) {
        @SuppressWarnings("unchecked")
        List<Message> messages = (List<Message>) session.getAttribute("messageList");
        messages.add(message);
        model.addAttribute("message", new Message());
        return "redirect:/";
    }

    @GetMapping("destroyMessageSession")
    public String destroyMessageSession(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
