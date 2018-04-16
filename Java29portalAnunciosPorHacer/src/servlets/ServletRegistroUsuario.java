package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.AnunciosDAO;
import daos.UsuarioDAO;
import daosImpl.AnunciosDAOImpl;
import daosImpl.UsuarioDAOImpl;
import modelo.Anuncio;
import modelo.Usuario;

@WebServlet("/ServletRegistroUsuario")
public class ServletRegistroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("se ejecuta el post del ServletRegistroUsuario");
		
		String nombre = request.getParameter("campoNombre");
		String direccion = request.getParameter("campoDireccion");
		String telefono = request.getParameter("telefono");
		String email = request.getParameter("email");
		String descripcion = request.getParameter("campoDescripcion");
		

		Usuario nuevoUsuario = new Usuario(nombre, direccion,
				 telefono, email, descripcion);
		

		UsuarioDAO UsuarioDAO = new UsuarioDAOImpl();
		UsuarioDAO.registrarUsuario(nuevoUsuario);
		
		request.getRequestDispatcher("registroUsuarioOK.jsp").forward(request, response);

	}// end doPost

}// end clas

