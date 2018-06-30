package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import guru.springframework.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;
//    @Qualifier("greetingServiceImpl")
//    public IGreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingService.sayGreeting();
//        return greetingServiceImpl.sayGreeting();
    }
}
