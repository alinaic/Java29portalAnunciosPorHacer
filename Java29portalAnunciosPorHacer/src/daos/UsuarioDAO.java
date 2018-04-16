package daos;

import java.util.List;

import modelo.Anuncio;
import modelo.Usuario;

public interface UsuarioDAO {

	void registrarUsuario(Usuario usuario);

	List<Usuario> obtenerUsuario();

}
