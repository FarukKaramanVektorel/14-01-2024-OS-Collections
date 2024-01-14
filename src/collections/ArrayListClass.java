package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Ayşe");
		al.add("Ayla");
		al.add("Ayten");
		al.add("Ali");
		al.add("Ahmet");
		al.add("Aliye");
		al.add("Mustafa");
		al.add("Zeynep");
		al.add("Fatma");
		al.add("Aliye");
		
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//		}
//		for (int i = al.size()-1; i >= 0; i--) {
//			System.out.println(al.get(i));
//		}
		
//		for (String string : al) {
//			System.out.println(string);
//			
//		}
		
		Iterator<String> isimler=al.iterator();
		while (isimler.hasNext()) {
			String string = (String) isimler.next();
			System.out.println(string);			
		}
		
		
		
		

	}

}
