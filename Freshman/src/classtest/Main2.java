package classtest;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student yoo = new Student("유승택", 25, 171, 61, "2016314024", 3, 3.38);
		Student lee = new Student("이재혁", 25, 000, 00, "2016316000", 3, 0);
		Professor yg = new Professor("이영곤", 52, 000, 00, "IT경영학과", 306);
		Person who = new Person("아무개", 30, 168, 51);
		Student[] students = new Student[100];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 100; i++) {
			System.out.println("이름을 입력");
			students[i] = new Student(sc.next(), 20, 175, 70, i + "", 1, 4.5);
			students[i].show();
		}
		yoo.show();
		lee.show();
		yg.show();
		who.show();
	}

}
