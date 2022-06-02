package in.synxt.clonedemo;


public class App {
	public static void main(String[] args) throws CloneNotSupportedException {
		Bike bike = Bike.getInstance("Unicorn","AP26 BQ 1341",10,1);
		bike.accelarate(10);
		bike.changeGear(2);
		
		bike.accelarate(20);
		bike.changeGear(3);
		Bike secondBike = Bike.getInstance("Unicorn","AP26 BQ 1341",10,1);
		System.out.println(bike==secondBike);
		System.out.println(secondBike);
		
		Bike thirdBike = (Bike)bike.clone();
		System.out.println(bike==thirdBike);
		System.out.println(thirdBike);
		
		/*
		 * Bike clonedBike = (Bike)bike.clone(); System.out.println(bike==clonedBike);
		 * System.out.println(bike); System.out.println(clonedBike);
		 * bike.accelarate(30); bike.changeGear(4); System.out.println(bike);
		 * System.out.println(clonedBike);
		 */
	}
}
