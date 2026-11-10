package in.books.spring_ci_demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api")
public class Controller {

    @GetMapping("/message")
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("Hello, Spring CI Demo!!");
    }

    @GetMapping 
    public String welcome() {
        return "Welcome to Spring CI Demo!";
    }
    
}
