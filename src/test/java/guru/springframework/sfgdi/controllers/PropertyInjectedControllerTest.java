package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.servics.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void  setUp(){
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }
    @Test
    void greeting() {
        System.out.println(controller.getGreeting());
    }
}