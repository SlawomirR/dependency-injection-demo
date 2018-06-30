package guru.springframework.controllers;

import guru.springframework.services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private IGreetingService greetingService;

//    @Autowired
    public ConstructorInjectedController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
