
public class Student {
	private String name;
	private String lastName;
	private String stdNo;
	
	
	
	public Student(String name, String lastName, String stdNo) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.stdNo = stdNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStdNo() {
		return stdNo;
	}
	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}
	@Override
	public String toString() {
		return "Öğrenci Adı: " + this.name + ", Soyadı: " + this.lastName + ", Öğrenci No: " + this.stdNo ;
	}
	
	
	
	

}
