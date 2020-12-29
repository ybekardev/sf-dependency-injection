package guru.springframework.sfgdi.servics;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Greetings, from Setter";
    }
}
