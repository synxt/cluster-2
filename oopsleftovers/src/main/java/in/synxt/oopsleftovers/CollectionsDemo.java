package in.synxt.oopsleftovers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionsDemo {
	public static void main(String[] args) {
		/*
		 * int[] ages = new int[10]; ages[0]= 15; ages[1]= 25; ages[2]= 63; ages[3]= 40;
		 * ages[4]= 12; ages[5]= 14; ages[6]= 18; ages[7]= 19; ages[8]= 10; ages[9]= 20;
		 * 
		 * System.out.println("Enter the age"); Scanner sc = new Scanner(System.in); int
		 * newAge = sc.nextInt();
		 * 
		 * int[] tempAges = new int[11]; for(int i=0;i<10;i++) { tempAges[i] = ages[i];
		 * } tempAges[10]=newAge; ages = tempAges;
		 * 
		 * System.out.println(Arrays.toString(ages));
		 * 
		 * 
		 * System.out.println("Enter age to be deleted"); tempAges = new int[10]; int
		 * ageToBeDeleted = sc.nextInt(); for(int i=0,j=0;i<ages.length;i++) {
		 * if(ages[i] != ageToBeDeleted) { tempAges[j] = ages[i]; j++; } } ages =
		 * tempAges; System.out.println(Arrays.toString(ages));
		 */
		
		TreeSet<Integer> ages = new TreeSet<Integer>();
		ages.add(15);
		ages.add(25);
		ages.add(63);
		ages.add(40);
		ages.add(12);
		ages.add(14);
		ages.add(18);
		ages.add(19);
		ages.add(10);
		ages.add(20);
		ages.add(20);
		
		System.out.println("Enter a the new age");
		Scanner sc = new Scanner(System.in); 
		
		int newAge = sc.nextInt();		
		ages.add(newAge);
		System.out.println(ages);
		System.out.println("Enter a the new age to be deleted");
		
		int ageToBeDeleted  = sc.nextInt();		
		
		ages.remove(ageToBeDeleted);		
		System.out.println(ages);
		
		
		
		
	}
}
