package in.synxt.strings;

public class App {
	public static void main(String[] args) {
		
		String strLit = "Vandhematharam";
		String strLit2 = "Vandhematharam.....";
		
		String strObj =  new String("Vandhematharam");
		String strObj2 =  new String("VANDHEMATHARAM");
		
		if(strLit.equalsIgnoreCase(strLit2)) {
			System.out.println("Both Literals Are Same");
		}else {
			System.out.println("Both Literals Are Not Same");
		}
		
		if(strObj.equalsIgnoreCase(strObj2)) {
			System.out.println("Both Objects Are Same");
		}else{
			System.out.println("Both Objects Are Not Same");
		}
		
		System.out.println("Length of "+strLit+" is"+strLit.length());
		
		char[] chars = strLit.toCharArray();
		
		for(int i=0;i<chars.length;i++ ) {
			System.out.println(strLit.charAt(i));
		}
		
		System.out.println(strLit.toUpperCase());
		System.out.println(strLit);
		System.out.println(strLit.toLowerCase());
		System.out.println(strLit.compareTo(strLit2));
		
		String song = "Janaganamana Ahinayaka Jayahe Bharatha Bhagya Vidhatha....";
		String[] words = song.split(" ");
		
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		
	}
}

