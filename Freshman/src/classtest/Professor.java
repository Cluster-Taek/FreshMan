package classtest;

public class Professor extends Person{

	private String department;
	private int office;
	
	
	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getOffice() {
		return office;
	}


	public void setOffice(int office) {
		this.office = office;
	}

	
	public Professor(String name, int age, int height, int weight, String department, int office) {
		super(name, age, height, weight);
		this.department = department;
		this.office = office;
	}


	public void show() {
		System.out.println("_________________________________");
		System.out.println("이름 :" + getName());
		System.out.println("나이 :" + getAge());
		System.out.println("키 :" + getHeight());
		System.out.println("몸무게 :" + getWeight());
		System.out.println("학과 :" + getDepartment());
		System.out.println("사무실 :" + getOffice());
	}
	
	
}
