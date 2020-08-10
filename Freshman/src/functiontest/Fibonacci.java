package functiontest;

public class Fibonacci {
	
	
	static int function(int number) {
		int temp;
		
		if(number == 1 || number == 2) {
			temp = 1;
		} else {
			temp = function(number - 2) + function(number - 1);
		}
		return temp;
	}
	
	static void print(int number) {
		for(int i = 1; i <= number; i++) {
			System.out.println(function(i) + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(100);
	}

}
