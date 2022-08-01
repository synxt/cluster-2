<%@page errorPage="failure.jsp" %>
<%@taglib uri="http://in.synxt.enventory.jsp/tags" prefix="enven" %>
<jsp:useBean id="product" class="in.synxt.enventory.model.ProductModel" scope="request"></jsp:useBean>
<jsp:useBean id="productDao" class="in.synxt.enventory.dao.ProductDaoImpl" type="in.synxt.enventory.dao.ProductDao"></jsp:useBean>
<jsp:setProperty  property="*" name="product"/>
<jsp:setProperty  property="quantityInHand" name="product" param="inHandQuantity"/>
<enven:register name="product"/>
<jsp:forward page="success.jsp"></jsp:forward>