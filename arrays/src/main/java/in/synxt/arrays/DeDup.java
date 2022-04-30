package in.synxt.arrays;

public class DeDup {
	public static void main(String[] args) {
		int[] numbers = {10,20,30,20,10,40,80,90,65,40,30};
		int[] uniqueNumbers = new int[numbers.length];
		int uniqueCount = 0;
		boolean flag = false; 
		for(int i=0;i<numbers.length;i++) {
			flag = false;
			for(int j=0;j<uniqueCount;j++) {
				if(numbers[i] == uniqueNumbers[j]) {
					flag = true;
				}
			}
			
			if(!flag) {
				uniqueNumbers[uniqueCount] = numbers[i];
				uniqueCount++;
			}
		}
		for(int i=0;i<uniqueCount;i++) {
			System.out.println(uniqueNumbers[i]);
		}
	}
	
	
}
