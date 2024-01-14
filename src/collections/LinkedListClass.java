package collections;

import java.util.LinkedList;

public class LinkedListClass {
	
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Ayşe");
		ll.add("Ayla");
		ll.add("Ayten");
		ll.add("Ali");
		ll.add("Ahmet");
		ll.add("Aliye");
		ll.add("Mustafa");
		ll.add("Zeynep");
		ll.add("Fatma");
		ll.add("Aliye");
		
		ll.add(2, "Kemal");
		
		ll.addFirst("Muhammed");
		ll.addLast("sinan");
		//ll.clear();
		
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
	}

}
