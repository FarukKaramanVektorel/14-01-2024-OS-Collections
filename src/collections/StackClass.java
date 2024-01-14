package collections;

import java.util.Stack;

public class StackClass {
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		//first in last out 
		s.push("Elmas");
		s.push("Erdal");
		s.push("Emine");
		s.push("Ekrem");
		s.push("Mahsun");
		System.out.println(s.search("Arda"));
		
	}

}
