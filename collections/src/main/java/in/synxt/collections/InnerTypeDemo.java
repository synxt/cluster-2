package in.synxt.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InnerTypeDemo {
	public static void main(String[] args) {
		Map<Integer, String> names = new HashMap<Integer,String>();
		names.put(1, "Keerthi");
		names.put(2, "Bharath");
		names.put(3, "Mohi");
		names.put(4, "Dhruva");
		
		Set<Integer> ids = names.keySet();
		for(Integer id:ids) {
			System.out.println(names.get(id));
		}
		
		Set<Map.Entry<Integer, String>> entries = names.entrySet();
		for(Map.Entry<Integer, String> entry:entries) {
			System.out.println(entry.getKey()+"<--->"+entry.getValue());
		}
	}
}
