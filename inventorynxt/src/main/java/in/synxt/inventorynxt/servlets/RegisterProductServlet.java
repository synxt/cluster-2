package in.synxt.inventorynxt.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.synxt.inventorynxt.dao.ProductDao;
import in.synxt.inventorynxt.dao.ProductDaoImpl;
import in.synxt.inventorynxt.model.ProductModel;

/**
 * Servlet implementation class RegisterProductServlet
 */
public class RegisterProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDao dao = new ProductDaoImpl();
		ProductModel product = new ProductModel(
													0, 
													request.getParameter("name"), 
													request.getParameter("category"), 
													Double.valueOf(request.getParameter("price")), 
													Integer.valueOf(request.getParameter("inHandQuantity"))
											   );
		PrintWriter  out = response.getWriter();
		try {
			response.setContentType("text/html");
			int generatedId = dao.registerProduct(product);
			out.println("Product "+generatedId+" registered successfully");
			RequestDispatcher dispatcher = request.getRequestDispatcher("showproducts");
			dispatcher.forward(request, response);			
			out.println("Thank you");
		}catch(SQLException ex) {
			ex.printStackTrace();
			out.println("Product coudn't be registered");
		}
		
	}

}
