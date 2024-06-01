package com.Virtual.Classroom.Virtual.Classrom.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VCController {
    @GetMapping("/welcome")
    public String welcome() {

        return "Welcome here !!";

    }
}

