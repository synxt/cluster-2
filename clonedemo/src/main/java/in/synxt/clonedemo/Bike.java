package in.synxt.clonedemo;

public class Bike{
	private String model;
	private String regNum;
	private int speed;
	private int gear;
	private static Bike onlyObj  = null;
	private Bike() {}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRegNum() {
		return regNum;
	}
	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}
	public int getSpeed() {
		return speed;
	}

	public int getGear() {
		return gear;
	}
	public int accelarate(int by) {
		this.speed+=by;
		return this.speed;
	}
	public int changeGear(int gear) {
		this.gear = gear;
		return gear;
	}
	private Bike(String model, String regNum, int speed, int gear) {
		super();
		this.model = model;
		this.regNum = regNum;
		this.speed = speed;
		this.gear = gear;
	}
	public static Bike getInstance(String model, String regNum, int speed, int gear) {
		if(onlyObj==null) {
			onlyObj = new Bike(model,regNum,speed,gear);
		}
		return onlyObj;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "Bike [model=" + model + ", regNum=" + regNum + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
}
