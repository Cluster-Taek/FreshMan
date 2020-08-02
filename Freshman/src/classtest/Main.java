package classtest;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node.method3();
		Node.method1();
		
		Node one = new Node(10, 20);
		Node two = new Node(30, 40);
		
		Node center = one.getCenter(two);
		
		System.out.println(center.getX() + ", " + center.getY());
		
	}

}
