package modelo;

import javax.management.loading.PrivateClassLoader;

public class Usuario {

	private String nombre;
	private String direccion;
	private String telefono;
	private String email;
	private String descripcion;

	public Usuario() {

	}

	public Usuario(String nombre, String direccion, String descripcion,
			String telefono, String email) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", email=" + email
				+ ", descripcion=" + descripcion + "]";
	}

	
	

	

}
