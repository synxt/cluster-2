<jsp:useBean id="product" class="in.synxt.enventory.model.ProductModel" scope="request"></jsp:useBean>
<jsp:useBean id="productDao" class="in.synxt.enventory.dao.ProductDaoImpl" type="in.synxt.enventory.dao.ProductDao"></jsp:useBean>
<jsp:setProperty  property="*" name="product"/>
<jsp:setProperty  property="quantityInHand" name="product" param="inHandQuantity"/>
<%	
	int productId = productDao.registerProduct(product);	
%>
<html>
	<body>
		<h1 style="color:green">Product successfully registered with Id: <%=productId %></h1>
	</body>
</html>

