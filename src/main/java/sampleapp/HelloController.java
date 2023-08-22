package sampleapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hellos")
public class HelloController {
    @GetMapping
    public String getHello() {
        return "Hello!";
    }
}
