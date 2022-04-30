package in.synxt.arrays;

import java.util.Arrays;

public class ReverseArrays {
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50,60,70,80,90,100};
		int temp;
		int reverseIndex  = 0;
		for(int i=0;i<numbers.length;i++){
			reverseIndex = numbers.length-(i+1);
			if(i<reverseIndex) {
				temp = numbers[i];				
				numbers[i] = numbers[reverseIndex];
				numbers[reverseIndex] = temp;
			}
		}
		System.out.println(java.util.Arrays.toString(numbers));
	}
}
