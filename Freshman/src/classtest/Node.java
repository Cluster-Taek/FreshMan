package classtest;

public class Node {

	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x; //this와 default의 차이 확인
	}
	
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Node(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Node getCenter(Node n) {
		return new Node((this.x + n.getX()) /2, (this.y + n.getY()) / 2);
	}

	public static void method1() {
		
	}
	
	private static void method2() {
		
	}

	protected static void method3() {
	
}
	//접근제어자
	
	//public class : 모든  package에서 해당 class로 접근이 가능하다.

	//protected class : 상속받은 class 에서만 해당 class로 접근이 가능하다.
	
	//private class : 자신을 포함한 package에서만 해당 class로 접근이 가능하다.



	//public method : 모든 class에서 해당 method로 접근이 가능하다.
	
	//protected method : 상속 받은 class와 자신이 속한 class에서만 접근이 가능하다.

	//private method : 자신이 포함된 class에서만 해당 method로 접근이 가능하다.
	
	//상속
	
	//다른 클래스의 정보를 자신에게 포함
	//불필요한 코드를 줄여 효율적인 개발 가능
	//공통 특성을 가져오고 세부 특성을 나눠서 사용 가능

	

}
