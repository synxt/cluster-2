package in.synxt.strings;

public class StringCounter {
	public static void main(String[] args) {
		String sentence = "Jana Gana Mana Adhinayaka Jay He Bharata Bhagya Vidhata "
				+ "Panjab Sindhu Gujarat Maratha Dravida Utkala Banga Vindhya Himachal Yamuna Ganga "
				+ "Uchchala Jaladhi Taranga Tava Subha Name Jaage Tava Subha Aashish Mange Gaahe Tava Jay Gaatha "
				+ "Jana Gana Mangal Daayak Jay He Bharat Bhagya Vidhata"
				+ "Jayhe Jayhe Jayhe "
				+ "Jay Jay Jay Jay He";
		
		String[] words = sentence.split(" ");
		String key = "Jay";
		int counter = 0;
		for(int i=0;i<words.length;i++) {
			if(words[i].contains(key)) {
				counter++;
			}
		}
		System.out.printf("Word %s repeated %d times%n",key,counter);
	}
}
