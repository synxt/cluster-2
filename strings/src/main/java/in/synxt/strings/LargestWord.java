package in.synxt.strings;

import java.util.Arrays;

public class LargestWord {
	public static void main(String[] args) {
		String sentence = "Jana Gana Mana Adhinayaka Jay He Bharata Bhagya Vidhata "
				+ "Panjab Sindhu Gujarat Maratha Dravida Utkala Banga Vindhya Himachal Yamuna Ganga "
				+ "Uchchala Jaladhi Taranga Tava Subha Name Jaage Tava Subha Aashish Mange Gaahe Tava Jay Gaatha "
				+ "Jana Gana Mangal Daayak Jay He Bharat Bhagya Vidhata "
				+ "JayheJayhe Jayhe "
				+ "Jay Jay Jay Jay He ";
		String[] words = sentence.split(" ");
		String maxWord = "";
		int maxLength = 0;
		String[] maxWords = new String[words.length];
		int numOfMaxWords = 0;
		for(String word : words) {
			if(word.length()>maxWord.length()) {
				maxWord = word;
				maxWords = new String[words.length];
				numOfMaxWords = 0;
				maxWords[numOfMaxWords++] = word;
			}else if(word.length() == maxWord.length()) {
				maxWords[numOfMaxWords++] = word;
			}
		}
		
		for(int i=0;i<numOfMaxWords;i++) {
			System.out.println(maxWords[i]);
		}
	}
}
