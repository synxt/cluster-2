package in.synxt.generics;

public class Algorithms {
	
	public static <T extends Comparable> T[] sort(T[] numbers) {
		T temp = null;
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				
				  if(numbers[i].compareTo(numbers[j])>0) { 
					  temp = numbers[i]; 
					  numbers[i] = numbers[j]; 
					  numbers[j] = temp; 
				  }
				 
			}
		}
		return numbers;
	}

	
	public static <T> int search(T[] numbers,T key) {
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
}



