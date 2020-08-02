package classtest;

public class Student extends Person{

	private String studentId;
	private int grade;
	private double GPA;
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	public Student(String name, int age, int height, int weight, String studentId, int grade, double gPA) {
		super(name, age, height, weight);
		this.studentId = studentId;
		this.grade = grade;
		GPA = gPA;
	}
	
	public void show() {
		System.out.println("_________________________________");
		System.out.println("이름 :" + getName());
		System.out.println("나이 :" + getAge());
		System.out.println("키 :" + getHeight());
		System.out.println("몸무게 :" + getWeight());
		System.out.println("학번 :" + getStudentId());
		System.out.println("학년 :" + getGrade());
		System.out.println("학점 :" + getGPA());
	}
	
	
}
