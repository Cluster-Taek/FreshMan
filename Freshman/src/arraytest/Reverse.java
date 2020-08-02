package arraytest;

public class Reverse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100 + 1);
		}

		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		//반대로~
		reverse(a);
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		//오름차순~
		increase(a);
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
	
	
	static int[] reverse(int a[]) {
		for(int i = 0; i < a.length/2; i++) {
			int temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}
		return a;
	}
	
	static int[] increase(int a[]) {
		for(int i = 0; i < a.length/2; i++) {
			for(int j = 0; j < i; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = a[i];
				}
			}
		}
		return a;
	}

}
