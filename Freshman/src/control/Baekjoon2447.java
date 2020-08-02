package control;

import java.util.Scanner;

public class Baekjoon2447 {
	
	static void function(int i, int j, int number, int n) {
		if(Math.pow(3, number) == n) {
			System.out.print("*");
			return;
		}
		if((i / (int)Math.pow(3, number)) % 3 == 1 && (j / (int)Math.pow(3, number)) % 3 == 1) {
			System.out.print(" ");
		}else {
			function(i, j, number + 1, n);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				function(i, j, 0, a);
			}
			System.out.println();
		}
	}
	

}
