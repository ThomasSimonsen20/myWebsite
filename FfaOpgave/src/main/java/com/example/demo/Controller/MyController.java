package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {

    @GetMapping("/")
    public String welcome() {
        return "WelcomeScreen";
    }

    @GetMapping("/movies")
    public String movies() {
        return "Movies";
    }

    @GetMapping("/series")
    public String series() {
        return "Series";
    }

    @GetMapping("/babyDriver")
    public String babyDriver() {
        return "BabyDriver";
    }

    @GetMapping("/theBoys")
    public String theBoys() {
        return "TheBoys";
    }


}
