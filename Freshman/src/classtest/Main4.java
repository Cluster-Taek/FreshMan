package classtest;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node1 one = new Node1(10, 20);
		Node1 two = new Node1(30, 40);
		
		Node1 three = one.center(two);
		
		System.out.println(three.getX() + ", " + three.getY());
		
	}

}
