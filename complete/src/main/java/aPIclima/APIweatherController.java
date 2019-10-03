package aPIclima;


	
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.bind.annotation.RequestMapping;

@RestController("APIweather")
public class APIweatherController {
	
	    @RequestMapping("/locaciones")
	    public String agregarlocacion() {
	        return "Ingrese ciudad y país";
	    }
	    
	    @RequestMapping("/RegistroUsuario")
	    public Usuario registrarUsuario() {
	    return new Usuario("gabriel","1235");
		
		}
	    
	    @RequestMapping("/tablaclima")
	    public String motrarClima() {
	        return "Datos de clima";
	    }
	    
	    
	}


