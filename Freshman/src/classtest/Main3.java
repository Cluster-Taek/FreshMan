package classtest;

import java.util.Scanner;

public class Main3 {
	
	public static Administrator ad[] = new Administrator[4];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Human Jclef = new Human("제클", 960617, "Jclef", "0000");
		for(int i = 0; i < 4; i++) {
			System.out.println("이름?");
			String a = sc.next();
			System.out.println("생년웧일?");
			int b = sc.nextInt();
			System.out.println("아이디?");
			String c = sc.next();
			System.out.println("비밀번호?");
			String d = sc.next();
			System.out.println("직급?");
			String e = sc.next();
			Administrator ST = new Administrator(a, b, c, d, i, e);
			ad[i] = ST;
		}
		Member JH = new Member("재혁", 960617, "ljh", "0000", 1, "gold");
		Jclef.show();
		JH.show();
		for(int i = 0; i < ad.length; i++) {
			ad[i].show();
		}
		System.out.println(ad[4].getBirth());
		ad[4].setBirth(971008);
		System.out.println(ad[4].getBirth());
	}
	

}
