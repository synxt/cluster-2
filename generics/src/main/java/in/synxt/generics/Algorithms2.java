package in.synxt.generics;

public class Algorithms2<T> {
	
	public  int search(T[] numbers,T key) {
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
}



