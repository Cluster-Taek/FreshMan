package arraytest;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 3, 4, 5};
		
		int b[] = new int[5];
		
		a = b;
		
		a[0] = 5;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(b[i]);
		}
	}

}
