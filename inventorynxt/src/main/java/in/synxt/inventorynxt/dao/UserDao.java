package in.synxt.inventorynxt.dao;

import java.sql.SQLException;

import in.synxt.inventorynxt.model.UserModel;

public interface UserDao {
	UserModel verifyUser(UserModel userModel) throws SQLException;
}
