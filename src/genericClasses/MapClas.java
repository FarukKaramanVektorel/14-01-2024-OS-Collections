package genericClasses;

import java.util.HashMap;
import java.util.Map;

public class MapClas {
	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<>();		
		m.put(100, "Ali");
		m.put(101, "Ahmet");
		m.put(102, "Veli");
		m.put(103, "Hatice");
		m.put(104, "Hamza");
		
		System.out.println(m.get(104));
		System.out.println(m.containsKey(105));
		System.out.println(m.containsValue("Hamza"));
		System.out.println(m.size());
		
	}

}
