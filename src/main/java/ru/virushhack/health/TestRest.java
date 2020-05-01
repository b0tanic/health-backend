package ru.virushhack.health;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Тест рестов.
 *
 * @author Arsen Avalyan
 * @since 01.05.2020
 */
@RestController
public class TestRest {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
