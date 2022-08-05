package in.synxt.simplespring;

public class SampleDao {
	private UserDao userDao;
	public void getData() {		
		System.out.println("Get Data Method Is Called by "+userDao.getUsername());
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
