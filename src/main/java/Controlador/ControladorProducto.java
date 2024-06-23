package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassProducto;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ClassProducto crud = new ClassProducto();
        List<TblProductocl2> listarproducto = crud.ListarProducto();
        request.setAttribute("listadoproductos", listarproducto);
        request.getRequestDispatcher("/Listar.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombrecl2 = request.getParameter("nombre");
        Double precioventacl2 = Double.parseDouble(request.getParameter("precioventa"));
        Double preciocompracl2 = Double.parseDouble(request.getParameter("preciocompra"));
        String estadocl2 = request.getParameter("estado");
        String descripcl2 = request.getParameter("descrip");

        TblProductocl2 producto = new TblProductocl2();
        ClassProducto crud = new ClassProducto();

        producto.setNombrecl2(nombrecl2);
        producto.setPrecioventacl2(precioventacl2);
        producto.setPreciocompcl2(preciocompracl2);
        producto.setEstadocl2(estadocl2);
        producto.setDescripcl2(descripcl2);
        crud.RegistrarProducto(producto);

        List<TblProductocl2> listarProducto = crud.ListarProducto();
        request.setAttribute("listadoproductos", listarProducto);
        request.getRequestDispatcher("/Listar.jsp").forward(request, response);
	}

}
