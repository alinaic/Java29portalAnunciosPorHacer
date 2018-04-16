package daosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Anuncio;
import modelo.Usuario;
import daos.AnunciosDAO;
import daos.ConstantesSQL;
import daos.GenericDAO;
import daos.UsuarioDAO;

public class UsuarioDAOImpl extends GenericDAO implements UsuarioDAO {

	@Override
	public void registrarUsuario(Usuario usuario) {
		conectar();
		try {
			PreparedStatement ps = miConnection
					.prepareStatement(ConstantesSQL.INSERCION_USUARIO);

			ps.setString(1, usuario.getNombre());
			ps.setString(2, usuario.getDireccion());
			ps.setString(3, usuario.getTelefono());
			ps.setString(4, usuario.getEmail());
			ps.setString(5, usuario.getDescripcion());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("la sql de insercion del Usuario esta mal");
		}

		desconectar();

	}// registrarUsuario

	@Override
	public List<Usuario> obtenerUsuario() {
		conectar();
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			PreparedStatement ps = miConnection
					.prepareStatement(ConstantesSQL.SELECION_USUARIO);
			ResultSet resultado = ps.executeQuery();
			while (resultado.next()) {
				Usuario usuario = new Usuario();
				usuario.setNombre(resultado.getString("nombre"));
				usuario.setDireccion(resultado.getString("direccion"));
				usuario.setTelefono(resultado.getString("telefono"));
				usuario.setEmail(resultado.getString("email"));
				usuario.setDescripcion(resultado.getString("descripcion"));
				usuarios.add(usuario);
			}

		} catch (SQLException e) {
			System.out.println("sql select Usuario esta mal");
		}
		desconectar();
		return usuarios;
	}// end obtenerUsuario

}// end class
