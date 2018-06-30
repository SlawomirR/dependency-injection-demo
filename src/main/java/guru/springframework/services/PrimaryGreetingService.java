package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements IGreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from PrimaryGreetingService!";
    }
}
