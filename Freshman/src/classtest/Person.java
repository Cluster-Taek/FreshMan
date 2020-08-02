package classtest;

public class Person {
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//인스턴스를 만들 때 생성된 값으로 초기화
	public Person(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public void show() {
		System.out.println("_________________________________");
		System.out.println("이름 :" + getName());
		System.out.println("나이 :" + getAge());
		System.out.println("키 :" + getHeight());
		System.out.println("몸무게 :" + getWeight());
	}
	
}
