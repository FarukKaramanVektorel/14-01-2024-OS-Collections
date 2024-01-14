package genericClasses;

public class Main {
	public static void main(String[] args) {
		String[] isimler = { "Ahmet", "Mahmut", "Ayşe", "Kezban" };
		Integer[] numbers= {1000,5600,8954,325};
		Fruits f=new Fruits();
		f.ad="Elma";
		Fruits f2=new Fruits();
		f2.ad="Karpuz";
		Fruits f3=new Fruits();
		f3.ad="Kivi";
		Fruits f4=new Fruits();
		f4.ad="Muz";
		Fruits[] meyveler= {f,f2,f3,f4};
		ArrayDon don3=new ArrayDon();
		don3.arrDon(isimler);
		don3.arrDon(numbers);
		don3.arrDon(meyveler);
	}
}
