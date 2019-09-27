package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController("vaina")
public class HelloController {
    
    @RequestMapping("/hola")
    public String index() {
        return "Saludos desde Spring Boot!";
    }
    
    @RequestMapping("/persona")
    public Persona persona() {
    return new Persona("gabriel","Russo",23);
	
	}
    
    
}
