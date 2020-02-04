package encaplsulation;

public class Student {
	private String name;
	private String idNum;
	private int age;
	
	public String getstuName() {
		return name;
	}
	public String getidNum() {
		return idNum;
	}
	public int getage() {
		return age;
	}
	
	public void setname(String stuName) {
		 name = stuName;
	}
	public void setidNum(String idNum) {
		this.idNum = idNum;
	}
	public void setage(int age) {
		this.age = age;
	}

}
