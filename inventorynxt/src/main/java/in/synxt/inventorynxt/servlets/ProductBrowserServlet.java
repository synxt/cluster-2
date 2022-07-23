package in.synxt.inventorynxt.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.synxt.inventorynxt.dao.ProductDao;
import in.synxt.inventorynxt.dao.ProductDaoImpl;
import in.synxt.inventorynxt.model.ProductModel;

public class ProductBrowserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDao productDao = new ProductDaoImpl();
		List<ProductModel> products =  null;
		String rowTemplate="<tr>\r\n"
				+ "				<td>%s</td>\r\n"
				+ "				<td>%s</td>\r\n"
				+ "				<td>%f</td>\r\n"
				+ "				<td>%d</td>				\r\n"
				+ "			</tr>";
		
		String tableTemplete="<html>\r\n"
				+ "	<body>\r\n"
				+ "		<table border=1 style=\"border-collapse:collapse\">\r\n"
				+ "			<tr>\r\n"
				+ "				<th>Product Name</th>\r\n"
				+ "				<th>Product Category</th>\r\n"
				+ "				<th>Product Price</th>\r\n"
				+ "				<th>Quantity In Hand</th>				\r\n"
				+ "			</tr>	\r\n"
				+ "			%s\r\n"
				+ "		</table>\r\n"
				+ "	</body>\r\n"
				+ "</html>";
		StringBuilder sb = new StringBuilder();
		try{
			products = productDao.getAllProducts();
			for(ProductModel model:products) {
				sb.append(String.format(rowTemplate, model.getName(),model.getCategory(),model.getPrice(),model.getQuantityInHand()));
			}
			String responseTxt=String.format(tableTemplete, sb.toString());
			response.getWriter().println(responseTxt);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
