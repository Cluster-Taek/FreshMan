package arraytest;

import java.util.ArrayList;

public class Testong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1010;
		int index = 1;
		boolean test = false;
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i = 2; i < number; i++) {
			for(int j = 1; j < a.size(); j++) {
				if(i % a.get(j) == 0) {
					test = true;
				}
			}
			if(test == false) {
				a.add(i);
				System.out.println(index + " : " + i);
				index++;
			}
			test = false;
		}
	}

}
