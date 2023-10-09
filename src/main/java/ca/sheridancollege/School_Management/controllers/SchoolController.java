/*
 * Name:  Rachel Prasad
 * Student ID: 991702269
 * Assignment:  Exercise 3 - School Management
 * Program: Computer Systems and Network Engineering (Co-op)
 */

package ca.sheridancollege.School_Management.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ca.sheridancollege.School_Management.School;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SchoolController {
    private List<School> schoolList = new ArrayList<>();

    @GetMapping("/")
    public String goHome() {

        return "index";
    }

    @GetMapping("/addSchoolForm")
    public String showAddSchoolForm(Model model) {
        model.addAttribute("school", new School());
        return "addSchoolForm";
    }

    @PostMapping("/addSchool")
    public String addSchool(@ModelAttribute School school) {
        schoolList.add(school);

        return "redirect:/viewSchools";
    }

    @GetMapping("/viewSchools")
    public String viewSchools(Model model) {
        model.addAttribute("schools", schoolList);
        return "viewSchools";
    }

    @GetMapping("/removeAllSchools")
    public String removeAllSchools() {

        schoolList.clear();
        return "redirect:/viewSchools";
    }
}