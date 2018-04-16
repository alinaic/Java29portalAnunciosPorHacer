package daos;

public class ConstantesSQL {
	public static final String INSERCION_ANUNCIO = "insert into tabla_anuncios(titulo, precio, telefono, email, descripcion)"
			+ "values(?,?,?,?,?)";
	
	public static final String SELECION_ANUNCIOS =
			"select * from tabla_anuncios";

	public static final String INSERCION_USUARIO = "insert into tabla_usuario(nombre, direccion, telefono, email, descripcion)" 
	+ "values(?,?,?,?,?,)";
	
	public static final String SELECION_USUARIO =
			"SELECT * FROM portal_anuncios.tabla_usuario";
	
}//end class
