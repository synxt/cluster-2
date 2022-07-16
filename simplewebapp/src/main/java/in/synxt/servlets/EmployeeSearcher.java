package in.synxt.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeSearcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EmployeeSearcher() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String resposeStr = "<html>\n"
				+ "	<body>\n"
				+ "		<center>\n"
				+ "			<form action=\"emps\">\n"
				+ "				<div>\n"
				+ "					<span> <input type=\"text\" placeholder=\"Employee id\" name=\"eid\"/> </span>\n"
				+ "					<span> <input type=\"submit\" value=\"Search\"/>\n"
				+ "				</div>\n"
				+ "			</form>			\n"
				+ "		</center>	\n"
				+ "	</body>\n"
				+ "</html>";
		response.setContentType("text/html");
		response.getWriter().println(resposeStr);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
