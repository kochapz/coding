package org.kochapz.springboot.basics.databasedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/firstpage")
    public String returnThis() {
        return "HariBhai";
    }

}
