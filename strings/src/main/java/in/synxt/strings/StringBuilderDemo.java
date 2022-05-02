package in.synxt.strings;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Vandhematharam");
		builder
			.append(" Vandhematharam")
			.append(" Sujalam")
			.append(" Suphalam")
			.append(" Malayaja seethalam");
		
		
		System.out.println(builder);
	}
}
