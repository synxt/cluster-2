<%@page import="java.util.HashMap" isErrorPage="true" session="false"%>
<html>
<body>
	<%! String batchName ="Cluster-2"; %>
	<h2><%= request.getParameter("username")%></h2>
	<h2><%= batchName %></h2>
	<%
		out.println("Welcome to my JSP");
		int a = 10+20;
		out.println("Vandhematharam");
	%>
</body>
</html>
