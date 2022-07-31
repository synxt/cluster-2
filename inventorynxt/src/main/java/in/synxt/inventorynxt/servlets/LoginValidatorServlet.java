package in.synxt.inventorynxt.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.synxt.inventorynxt.dao.UserDao;
import in.synxt.inventorynxt.dao.UserDaoImpl;
import in.synxt.inventorynxt.model.UserModel;

public class LoginValidatorServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDao userDao = new UserDaoImpl();
		UserModel userModel = new UserModel();
		userModel.setUsername(request.getParameter("username"));
		userModel.setPassword(request.getParameter("password"));
		String successString = "<html>\n"
				+ "	<head>\n"
				+ "		<title>Next Gen Inventory</title>\n"
				+ "		<style>\n"
				+ "			#title_hldr{\n"
				+ "			  width:100%;\n"
				+ "			  color:purple;\n"
				+ "			  font-size:30px;  \n"
				+ "			}\n"
				+ "			#title_txt{\n"
				+ "			  display: inline-block;\n"
				+ "			  margin-left:40%  \n"
				+ "			}\n"
				+ "			.input_cntr .label_txt{\n"
				+ "			  display: inline-block;\n"
				+ "			  width: 250px;\n"
				+ "			  margin-left: 30%;\n"
				+ "			  margin-top: 20px;\n"
				+ "			  color:navy;\n"
				+ "			}\n"
				+ "			.input_cntr input[type='submit']{\n"
				+ "			  width:250px;\n"
				+ "			  height:40px;\n"
				+ "			  margin-top: 25px;\n"
				+ "			  margin-left: 40%;\n"
				+ "			  background-color:white;\n"
				+ "			  border: 1px solid green;\n"
				+ "			  color:green;\n"
				+ "			  font-size:16px;\n"
				+ "			}\n"
				+ "			.input_cntr input[type='submit']:hover{\n"
				+ "			  color:white;\n"
				+ "			  background-color:green;\n"
				+ "			}\n"
				+ "		</style>\n"
				+ "	</head>\n"
				+ "	<body>\n"
				+ "		<div id=\"title_hldr\">\n"
				+ "		    <span id=\"title_txt\">Register Product</span>	\n"
				+ "		</div>\n"
				+ "		<div id=\"form_hldr\">\n"
				+ "			<form action=\"register\" method=\"post\">\n"
				+ "				<div class=\"input_cntr\">\n"
				+ "					<span class=\"label_txt\">Product Name:</span>\n"
				+ "					<span class=\"input_hldr\">\n"
				+ "						<input type=\"text\" name=\"name\"/>\n"
				+ "					</span>\n"
				+ "				</div>\n"
				+ "				<div class=\"input_cntr\">\n"
				+ "					<span class=\"label_txt\">Product Category:</span>\n"
				+ "					<span class=\"input_hldr\">\n"
				+ "						<input type=\"text\" name=\"category\"/>\n"
				+ "					</span>\n"
				+ "				</div>\n"
				+ "				<div class=\"input_cntr\">\n"
				+ "					<span class=\"label_txt\">Product Price:</span>\n"
				+ "					<span class=\"input_hldr\">\n"
				+ "						<input type=\"text\" name=\"price\"/>\n"
				+ "					</span>\n"
				+ "				</div>\n"
				+ "				<div class=\"input_cntr\">\n"
				+ "					<span class=\"label_txt\">Product Quantity In Hand:</span>\n"
				+ "					<span class=\"input_hldr\">\n"
				+ "						<input type=\"text\" name=\"inHandQuantity\"/>\n"
				+ "					</span>\n"
				+ "				</div>\n"
				+ "				<div class=\"input_cntr\">\n"				
				+ "					<span class=\"input_hldr\">\n"
				//+ "						<input type=\"hidden\" name=\"username\" value=\""+userModel.getUsername()+"\"/>\n"
				+ "					</span>\n"
				+ "				</div>\n"
				+ "				<div class=\"input_cntr\">\n"
				+ "					<span class=\"input_hldr\">\n"
				+ "						<input type=\"submit\" value=\"Register\"/>\n"
				+ "					</span>\n"
				+ "				</div>\n"
				+ "			</form>\n"
				+ "		</div>\n"
				+ "	</body>	\n"
				+ "</html>\n"
				+ "";		
		try {
			userModel = userDao.verifyUser(userModel);
			response.setContentType("text/html");
			
			if (userModel.isEnabled()) {
				response.getWriter().println(successString);
				HttpSession ses = request.getSession(true);
				ses.setAttribute("username", request.getParameter("username"));
				Cookie usernameCookie = new Cookie("username", request.getParameter("username"));				
				response.addCookie(usernameCookie);
				ses.setMaxInactiveInterval(30);
			}else {
				String failureString = "<html>\n"
						+ "	<head>\n"
						+ "		<title>Next Gen Inventory</title>\n"
						+ "		<style>\n"
						+ "			#title_hldr{\n"
						+ "			  width:100%;\n"
						+ "			  color:purple;\n"
						+ "			  font-size:30px;  \n"
						+ "			}\n"
						+ "			#title_txt{\n"
						+ "			  display: inline-block;\n"
						+ "			  margin-left:40%  \n"
						+ "			}\n"
						+ "			.input_cntr .label_txt{\n"
						+ "			  display: inline-block;\n"
						+ "			  width: 250px;\n"
						+ "			  margin-left: 30%;\n"
						+ "			  margin-top: 20px;\n"
						+ "			  color:navy;\n"
						+ "			}\n"
						+ "			.input_cntr input[type='submit']{\n"
						+ "			  width:250px;\n"
						+ "			  height:40px;\n"
						+ "			  margin-top: 25px;\n"
						+ "			  margin-left: 40%;\n"
						+ "			  background-color:white;\n"
						+ "			  border: 1px solid green;\n"
						+ "			  color:green;\n"
						+ "			  font-size:16px;\n"
						+ "			}\n"
						+ "			.input_cntr input[type='submit']:hover{\n"
						+ "			  color:white;\n"
						+ "			  background-color:green;\n"
						+ "			}\n"
						+ "			.input_cntr .label_txt.error_txt{			  \n"
						+ "			  color:red;\n"
						+ "				width: 500px;\n"
						+ "			}\n"
						+ "		</style>\n"
						+ "	</head>\n"
						+ "	<body>\n"
						+ "		<div id=\"title_hldr\">\n"
						+ "		    <span id=\"title_txt\">Login</span>	\n"
						+ "		</div>\n"
						+ "		<div id=\"form_hldr\">\n"
						+ "			<form action=\"login\" action=\"post\">\n"
						+ "				<div class=\"input_cntr\">\n"
						+ "					<span class=\"label_txt error_txt\">Username:"+userModel.getUsername()+" or Password Invalid</span>				\n"
						+ "				</div>\n"
						+ "				<div class=\"input_cntr\">\n"
						+ "					<span class=\"label_txt\">Username:</span>\n"
						+ "					<span class=\"input_hldr\">\n"
						+ "						<input type=\"text\" name=\"username\"/>\n"
						+ "					</span>\n"
						+ "				</div>\n"
						+ "				<div class=\"input_cntr\">\n"
						+ "					<span class=\"label_txt\">Password:</span>\n"
						+ "					<span class=\"input_hldr\">\n"
						+ "						<input type=\"password\" name=\"password\"/>\n"
						+ "					</span>\n"
						+ "				</div>				\n"
						+ "				<div class=\"input_cntr\">\n"
						+ "					<span class=\"input_hldr\">\n"
						+ "						<input type=\"submit\" value=\"Login\"/>\n"
						+ "					</span>\n"
						+ "				</div>\n"
						+ "			</form>\n"
						+ "		</div>\n"
						+ "	</body>	\n"
						+ "</html>";
				response.getWriter().println(failureString);
			}
			 
			//response.sendRedirect("register.html");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
