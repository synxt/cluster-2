package in.synxt.arrays;

public class LinearSearch {
	public static void main(String[] args) {
		
		int[] numbers = {10,4,9,7,6,8,1,2,3};
		outer: for(int key=1;key<=10;key++){
			for(int j=0;j<numbers.length;j++) {
				if(key == numbers[j]) {
					break;
				}
				if(j==numbers.length-1) {
					System.out.println("Missing Element Is "+key);
					break outer;
				}
			}
		}
	}
}
