package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("pl")
@Primary
public class PrimaryPolishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryPolishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getPolishGreeting();
    }
}
