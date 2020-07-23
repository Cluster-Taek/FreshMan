package arraytest;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[7];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 7; i++) {
			a[i] = (int)(Math.random() * 50) + 1;
			for(int j = 0; j < i; j++) {
				if(a[i] == a[j]) {
					i--;
				}
			}
		}
		
		for(int i = 0; i < 7; i++) {
			if(i == 6) {
				System.out.println("+ " + a[i]);
			} else {
				System.out.print(a[i] + " ");
			}	
		}
		
		System.out.println("숫자 입력 ㄱ");
		int num = sc.nextInt();
		for(int i = 0; i < 7; i++) {
			if(num == a[i]) {
				System.out.println("숫자 있음");
				break;
			}
		}
		
		
	}

}
