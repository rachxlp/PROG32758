package ca.sheridancollege.FirstWebApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String index() {
        return "index"; // Check that "index" matches the actual HTML template name
    }
}


//    @GetMapping("/register")
//    public String registerUser(
//            @RequestParam String firstName,
//            @RequestParam String lastName,
//            @RequestParam(defaultValue = "off") String rememberMe
//    ) {
//        System.out.println(firstName + " " + lastName + " " + rememberMe);
//        return "success!";
//    }
//
//    @GetMapping("register_page")
//    public String goRegister() {
//        return "register";
//    }

