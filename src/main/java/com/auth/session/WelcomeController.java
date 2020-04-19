package com.auth.session;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String home() {
        return "Home Page";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }


}
