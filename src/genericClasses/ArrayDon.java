package genericClasses;

public class ArrayDon {//Type

	
	
	public ArrayDon() {
		
	}
	
	public<T> void arrDon(T[] arr) {
		for (T t: arr) {
			System.out.println(t);
		}
	}
}
