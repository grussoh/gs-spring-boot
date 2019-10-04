package aPIclima;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Usuario {

	String nombreUsuario,password,nombrePersona;
	
	
	@Id
	Integer identificador;

	public Usuario(String nombreUsuario, String password, String nombrePersona) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.nombrePersona = nombrePersona;
	}
	
	public Usuario(String nombreUsuario, String password) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.nombrePersona = nombrePersona;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	
	
}
