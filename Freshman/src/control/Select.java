package control;

import java.util.Scanner;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 렛츠기릿");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A+");
		}
		if(score >= 80) {
			System.out.println("B+");
		}
		if(score >= 70) {
			System.out.println("C+");
		}
		if(score >= 0){
			System.out.println("F");
		}
		
	
	}

}
