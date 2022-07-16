package in.synxt.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.synxt.models.Employee;
import in.synxt.store.EmployeeStore;
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * try { Class.forName("oracle.jdbc.driver.OracleDriver"); } catch
		 * (ClassNotFoundException e) { e.printStackTrace(); }
		 */
		EmployeeStore store = new EmployeeStore();
		int empId = Integer.parseInt(request.getParameter("eid"));
		List<Employee> emps = store.getEmps();
		Employee reqEmp = null;
		for(Employee emp:emps) {
			if(emp.getId() == empId) {
				reqEmp = emp;
				break;
			}
		}
		response.setContentType("text/html");
		
		String successResponseTemplate = "<html>\n"
				+ "	<body>\n"
				+ "		<center>\n"
				+ "			<h1 style=\"color:green\"> Employee Information</h1>\n"
				+ "			<div>\n"
				+ "				<span style=\"color:red\">Employee Id:</span><span>%d</span>\n"
				+ "			</div>			\n"
				+ "			<div>\n"
				+ "				<span style=\"color:red\">Employee Name:</span><span>%s</span>\n"
				+ "			</div>\n"
				+ "			<div>\n"
				+ "				<span style=\"color:red\">Employee Salary:</span><span>%f</span>\n"
				+ "			</div>\n"
				+ "			<div>\n"
				+ "				<span style=\"color:red\">Employee Mobile Number:</span><span>%s</span>\n"
				+ "			</div>\n"
				+ "		</center>	\n"
				+ "	</body>\n"
				+ "</html>\n"
				+ "";
		
		String failureResponseTemplate = "<html>\n"
				+ "	<body>\n"
				+ "		<center>\n"
				+ "			<h1 style=\"color:red\"> Employee %d Information Not Found</h1>\n"
				+ "		</center>	\n"
				+ "	</body>\n"
				+ "</html>";
		
		String responseStr = null;
		if(reqEmp!=null) {
			responseStr = String.format(successResponseTemplate, reqEmp.getId(),reqEmp.getName(),reqEmp.getSalary(),reqEmp.getMobileNumber());
		}else {
			responseStr = String.format(failureResponseTemplate, empId);
		}
		
		PrintWriter out = response.getWriter();
		
		out.println(responseStr);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
