package io.github.slawomirr.services;

//@Service
//@Profile("pl")
//@Primary
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
