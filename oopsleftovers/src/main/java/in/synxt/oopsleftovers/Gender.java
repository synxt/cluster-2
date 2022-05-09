package in.synxt.oopsleftovers;

public enum Gender {
	MALE(21),FEMALE(18),TG(18);	
	
	private Gender(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	private int ageLimit;
	public boolean canMarry(int age) {
		if(age>=ageLimit) {
			return true;
		}else {
			return false;
		}
	}
}
