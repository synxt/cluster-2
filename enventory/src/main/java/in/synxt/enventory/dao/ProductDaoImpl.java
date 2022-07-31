package in.synxt.enventory.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.synxt.enventory.model.ProductModel;
import in.synxt.enventory.utils.DatabaseUtility;

public class ProductDaoImpl implements ProductDao {

	@Override
	public int registerProduct(ProductModel model) throws SQLException {
		Connection conn = null;

		try {
			conn = DatabaseUtility.getConnection();
			String insertProduct = "INSERT INTO products (id,name,category,price,quantity_in_hand) VALUES(SEQ_PROD.nextval,?,?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(insertProduct);
			stmt.setString(1, model.getName());
			stmt.setString(2, model.getCategory());
			stmt.setDouble(3, model.getPrice());
			stmt.setInt(4, model.getQuantityInHand());
			stmt.executeUpdate();
			String retriveKeys = "SELECT SEQ_PROD.currval as id FROM DUAL";
			ResultSet rs = conn.prepareStatement(retriveKeys).executeQuery();
			rs.next();
			return rs.getInt("id");
		} catch (SQLException | ClassNotFoundException ex) {
			throw new SQLException("Couln't insert the product ", ex);
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
	}

	@Override
	public List<ProductModel> getAllProducts() throws SQLException {
		Connection conn = null;
		List<ProductModel> products = new ArrayList<>();	
		try {
			conn = DatabaseUtility.getConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT id,name,category,price,quantity_in_hand FROM products");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				products.add(new ProductModel(rs.getInt("id"),rs.getString("name"), rs.getString("category"), rs.getDouble("price"), rs.getInt("quantity_in_hand")));
			}
			return products;
		} catch (SQLException | ClassNotFoundException ex) {
			throw new SQLException("Couldn't fetch products", ex);
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
	}

}
