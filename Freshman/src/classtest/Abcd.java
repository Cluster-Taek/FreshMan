package classtest;

import java.util.Scanner;

public class Abcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 abcd[] = new Student1[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < abcd.length; i++) {
			
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("성별 : ");
			String gender = sc.next();
			System.out.print("키 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.println();
			
			abcd[i] = new Student1(name, i + 1, gender, height, weight);
		}
		
		for(int i = 0; i < abcd.length; i++) {
			System.out.println(abcd[i].getName() + " : " + abcd[i].getNumber() + " : " + abcd[i].getGender() + " : " + abcd[i].getHeight() + " : " + abcd[i].getWeight());
		}
		
		
	}

}
