package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("pl")
public class PrimaryGreetingServicePolish implements IGreetingService {

    @Override
    public String sayGreeting() {
        return "Pozdrowienia wysłane z klasy PrimaryGreetingServicePolish!";
    }
}
