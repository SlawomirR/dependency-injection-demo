package guru.springframework.controllers;

import guru.springframework.services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private IGreetingService greetingService;

    public MyController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
//        System.out.println("Hello World!");
        return greetingService.sayGreeting();
    }
}
