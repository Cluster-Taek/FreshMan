package functiontest;

public class Main {

	//반환형, 함수명, 매개변수
	public static int function(int a, int b, int c) {
		int min;
		if(a > b) {
			if(b > c) {
				min  = c;
			}else {
				min = b;
			}
		}else {
			if(a > c) {
				min = c;
			}else {
				min = a;
			}
		}
		for(int i = min; i > 0; i--) {
			if(a % i == 0 && b % i == 0 && c % i == 0) {
				return i;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("최대 공약수 : " + function(400, 300, 750));
	
	}

}
