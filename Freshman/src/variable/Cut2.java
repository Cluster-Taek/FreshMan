package variable;

import java.util.Arrays;

public class Cut2 {
	
	public static int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (int)(n / Math.pow(10, answer.length - i - 1));
            n = n - (long)(answer[i] * n/Math.pow(10, answer.length - i - 1));
        }
        for(int i = 0; i < answer.length/2; i++) {
            int temp = answer[i];
            answer[i] = answer[answer.length - i - 1];
            answer[answer.length - i - 1] = temp;
        }
        return answer;
    }
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(12345)));
	}
}
