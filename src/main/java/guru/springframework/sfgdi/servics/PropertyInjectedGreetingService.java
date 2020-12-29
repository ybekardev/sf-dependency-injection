package guru.springframework.sfgdi.servics;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Greetings, from Property!";
    }
}
