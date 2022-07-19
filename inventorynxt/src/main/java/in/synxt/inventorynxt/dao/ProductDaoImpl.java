package in.synxt.inventorynxt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import in.synxt.inventorynxt.model.ProductModel;
import in.synxt.inventorynxt.utils.DatabaseUtility;

public class ProductDaoImpl implements ProductDao  {

	@Override
	public int registerProduct(ProductModel model) throws SQLException {
		Connection conn = null;
		
		try{
			conn = DatabaseUtility.getConnection(); 
			String insertProduct = "INSERT INTO products (name,category,price,quantity_in_hand) VALUES(?,?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(insertProduct,Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, model.getName());
			stmt.setString(2, model.getCategory());
			stmt.setDouble(3, model.getPrice());
			stmt.setInt(4, model.getQuantityInHand());
	
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			return rs.getInt("id");
		}catch(SQLException | ClassNotFoundException ex) {
			throw new SQLException("Couln't insert the product ",ex);
		}finally {
			if(conn != null) {
				conn.close();
			}
		}
		
	}

}
