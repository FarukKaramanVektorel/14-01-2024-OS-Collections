import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Student st1=new Student("Kemal","Kaya","OGR005");
		Student st2=new Student("Keriman", "Subaşı", "OGR001");
		Student st3=new Student("Mustafa","Deniz","OGR0015");
		Student st4=new Student("Aynur", "Keser", "OGR0100");
		Student st5=new Student("Arzu", "Keskin", "OGR0084");
		ArrayList<Student> ogrenciler=new ArrayList<>();
		ogrenciler.add(st1);
		ogrenciler.add(st2);
		ogrenciler.add(st3);
		ogrenciler.add(st4);
		ogrenciler.add(st5);
		Derslik d=new Derslik("LAB14", ogrenciler);
		System.out.println(d.ogrenciListele());
		System.out.println(d);
		
	}

}
