package nonGeneric;

public class Main {

	public static void main(String[] args) {
		Student s=new Student();
		Student s1=new Student();
		Student s2=new Student();
		Teacher t=new Teacher();
		Teacher t2=new Teacher();
		Stuff st=new Stuff();
		Stuff st2=new Stuff();
		Stuff st3=new Stuff();
		
		Person[] personel= {s,s1,s2,t,t2,st,st3,st2,};
		for (Person person : personel) {
			if(person instanceof Stuff) {
				Stuff sd=(Stuff) person;
				sd.bilgiVer();
			}else if(person instanceof Teacher) {
				Teacher sd=(Teacher) person;
				sd.infoVer();
			}else if(person instanceof Student) {
				Student sd=(Student) person;
				sd.bilgi();
			}else {
				System.out.println("Tanımsız");
				
			}
		}


	}

}
