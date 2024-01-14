package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueeClass {
	public static void main(String[] args) {
		//first in first out
		
		Queue<String> q=new LinkedList<>();
		System.out.println(q.peek());
		
		
		q.add("Ali");
		q.add("veli");
		q.add("tarkan");
		q.offer("nuran");
		System.out.println(q.size());//3
		System.out.println(q.peek());
		System.out.println(q.size());//2
		System.out.println(q.element());
	}

}
