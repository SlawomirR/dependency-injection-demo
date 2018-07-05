package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;
//    @Qualifier("greetingServiceImpl")
//    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingService.sayGreeting();
//        return greetingServiceImpl.sayGreeting();
    }
}
