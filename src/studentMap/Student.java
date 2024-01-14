package studentMap;

public class Student {
	private String stNo;
	private String name;
	private int note;
	public Student(String stNo, String name, int note) {
		super();
		this.stNo = stNo;
		this.name = name;
		this.note = note;
	}
	public String getStNo() {
		return stNo;
	}
	public void setStNo(String stNo) {
		this.stNo = stNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Student [stNo=" + stNo + ", name=" + name + ", note=" + note + "]";
	}
	

}
