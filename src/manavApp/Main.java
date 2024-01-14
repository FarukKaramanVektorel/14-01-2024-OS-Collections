package manavApp;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Fruits f1=new Fruits(1, "Elma", 30);
		Fruits f2=new Fruits(2, "Erik", 25);
		Fruits f3=new Fruits(3, "Kiraz", 50);
		Fruits f4=new Fruits(4, "Kayısı", 40);
		Fruits f5=new Fruits(5, "Hurma", 60);
		
		Map<Integer, Fruits> m=new HashMap<>();
		m.put(f1.getId(), f1);
		m.put(f2.getId(), f2);
		m.put(f3.getId(), f3);
		m.put(f4.getId(), f4);
		m.put(f5.getId(), f5);

	}

}
