package in.synxt.enventory.tags;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import in.synxt.enventory.dao.ProductDao;
import in.synxt.enventory.dao.ProductDaoImpl;
import in.synxt.enventory.model.ProductModel;

public class RegisterProductTag extends SimpleTagSupport{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void doTag() throws JspException, IOException {
		ProductDao dao = new ProductDaoImpl();
		JspContext jspContext= getJspContext();
		PageContext pageContext = (PageContext)jspContext;
		ServletRequest request = pageContext.getRequest();
		ProductModel product = (ProductModel)request.getAttribute(name);
		try{
			int registeredId = dao.registerProduct(product);
			request.setAttribute("registeredId", registeredId );
		}catch(SQLException ex) {
			throw new JspException(ex);
		}
	}
	
}
