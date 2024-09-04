package application.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
    
    @GetMapping("/frutas")
    public Iterable<String> get() {
        String[] f = {"Maçã", "Banana", "Morango"};
        return Arrays.asList(f);
        }

        @GetMapping("/frutas/{}")
        public String get(int id) {
            return [id];
        }
}
