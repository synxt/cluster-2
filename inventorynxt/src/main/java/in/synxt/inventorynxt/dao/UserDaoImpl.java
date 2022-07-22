package in.synxt.inventorynxt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.synxt.inventorynxt.model.UserModel;
import in.synxt.inventorynxt.utils.DatabaseUtility;

public class UserDaoImpl implements UserDao{

	@Override
	public UserModel verifyUser(UserModel userModel) throws SQLException  {
		Connection conn = null;		
		try{
			conn = DatabaseUtility.getConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT username,password,enabled FROM users WHERE username=? AND password=?");
			stmt.setString(1, userModel.getUsername());
			stmt.setString(2, userModel.getPassword());
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				userModel.setEnabled(rs.getString("enabled").equals("Y")?true:false);
			}	
			return userModel; 
		}catch(SQLException | ClassNotFoundException ex) {
			throw new SQLException(ex);
		}finally{
			if(conn!=null) {
				conn.close();
			}
		}		
	}

}
