package abstracttest;

public class Main3 extends Player{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main3 m = new Main3();
		m.play("잔나비 - Together");
		m.pause();
		m.stop();
	}

	@Override
	void play(String song) {
		// TODO Auto-generated method stub
		System.out.println(song + " 재생");
	}

	@Override
	void pause() {
		// TODO Auto-generated method stub
		System.out.println("일시정지");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("정지");
	}

}
