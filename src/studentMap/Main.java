package studentMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("OGR001", "Ali Candan", 80);
		Student s2 = new Student("OGR002", "Poyraz Karayel", 70);
		Student s3 = new Student("OGR003", "Ramiz Karaeski", 60);
		Student s4 = new Student("OGR004", "Mehmet Karahanlı", 100);
		Student s5 = new Student("OGR005", "Abdulhey Çoban", 40);
		
		Map<String, Student> ogrenciler=new HashMap<>();
		ogrenciler.put(s1.getStNo(), s1);
		ogrenciler.put(s2.getStNo(), s2);
		ogrenciler.put(s3.getStNo(), s3);
		ogrenciler.put(s4.getStNo(), s4);
		ogrenciler.put(s5.getStNo(), s5);
		
		System.out.println(ogrenciler.get("OGR002"));

	}

}
