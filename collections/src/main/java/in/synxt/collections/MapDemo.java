package in.synxt.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> names = new HashMap<Integer, String>();
		names.put(1, "Kumar");
		names.put(2, "Raja");
		names.put(3, "Raja");
		names.put(10, "Pranav");
		names.put(10, "Kasyap");
		names.put(5, "Venkat");
		names.put(7, "Keerthi");
		names.put(9, "Sasi");
		names.put(8, "Latha");
		names.put(11, "Sujatha");
		System.out.println(names);
		System.out.println(names.get(10));
		System.out.println(names.keySet());
		System.out.println(names.values());
		for(Integer id:names.keySet()) {
			System.out.println(names.get(id));
		}
	}
}
