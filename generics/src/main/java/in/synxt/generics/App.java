package in.synxt.generics;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		
		
		Integer[] ages = {10,20,50,40,12,32,56,54,45,65,98,78};
		int key = 78;
		Algorithms.<Integer>search(ages, key);
		
		
		String[] names = {"Latha","Geetha","Seetha","Sujatha","Kavitha","Laxmi","Kumari","Prabhavathi"};
		String keyName = "Laxmi";
				
		
		Algorithms.<String>search(names, keyName);							

		System.out.println(Arrays.toString(Algorithms.sort(ages)));
		System.out.println(Arrays.toString(Algorithms.sort(names)));
	}
}
