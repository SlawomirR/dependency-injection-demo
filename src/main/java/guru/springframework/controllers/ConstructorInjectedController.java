package guru.springframework.controllers;

import guru.springframework.services.IGreetingService;

public class ConstructorInjectedController {

    private IGreetingService greetingService;

    public ConstructorInjectedController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
