import java.util.List;

public class Derslik {
	private String name;
	private List<Student> ogrenciler;
	
	public Derslik(String name, List<Student> ogrenciler) {
		
		this.name = name;
		this.ogrenciler = ogrenciler;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getOgrenciler() {
		return ogrenciler;
	}
	public void setOgrenciler(List<Student> ogrenciler) {
		this.ogrenciler = ogrenciler;
	}
	
	public String ogrenciListele() {
		String info="";
		for (Student student : this.ogrenciler) {
			info+=student.toString()+"\n";
		}
		
		
		return info;
	}
	
	@Override
	public String toString() {
		
		return this.name+" "+this.ogrenciler;
	}
	

}
