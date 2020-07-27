package arraytest;

import java.util.Arrays;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int max;
		int min;
		
		int a[] = new int[100];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		max = a[0];
		min = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
			
			if(min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("SUM : " + sum);
		System.out.println("AVG : " + sum/a.length);
		System.out.println("MAX : " + max);
		System.out.println("MIN : " + min);
	}

}
