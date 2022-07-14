package in.synxt.exceptions;

public class PicUser {
	public void showProfile(int id) throws ProfileCanNotBeLoaded {
		try{
			Object pic = getProfilePic(id);		
			String address = getAddress(id);		
			String email = getEmail(id);
		}catch(ProfilePicCanNotBeLoadedException | AddressCanNotLoadException | EmailCanNotLoadException ex) {
			throw new ProfileCanNotBeLoaded("Profile can not be loaded",ex);
		}
	}

	public Object getProfilePic(int id) throws  ProfilePicCanNotBeLoadedException{
		Object compressedPic = null;
		try{
			String path = getProfilePicPath(id);
			Object pic = getProfilePic(path);
			compressedPic = compress(pic);
		}catch(NoPathFound | NoPicFound | CanNotCompress ex ) {
			throw new ProfilePicCanNotBeLoadedException("Can not load the profile Pic",ex);	
		}
		return compressedPic;
	}
	private String getEmail(int id) throws EmailCanNotLoadException {
		if(id==0) throw new EmailCanNotLoadException("Email Could Not Be loaded");
		return "thevamsi@live.com";
	}
	private String getAddress(int id) throws AddressCanNotLoadException {
		if(id==0) throw new AddressCanNotLoadException("Email Could Not Be loaded");
		return "Naidupet";
	}
	private Object compress(Object pic) throws CanNotCompress {
		if(pic==null) {
			throw new CanNotCompress("Profile Pic Can Not Be Compressed");
		}
		return new Object();
	}
	private Object getProfilePic(String path) throws NoPicFound {
		if(path==null) {
			throw new NoPicFound("Profile Pic Notfound at given location");
		}
		return new Object();
	}
	private String getProfilePicPath(int id) throws NoPathFound {
		if(id==0){
			throw new NoPathFound("Profile Path Not Found For "+id); 
		}
		return "SamplePath";
	}
}
