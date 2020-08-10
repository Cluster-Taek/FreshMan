package abstracttest;

public class Main extends Player{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.play("잔나비 - Together");
		main.pause();
		main.stop();
	}

	@Override
	void play(String songName) {
		// TODO Auto-generated method stub
		System.out.println(songName + " 재생");
	}

	@Override
	void pause() {
		// TODO Auto-generated method stub
		System.out.println("일시정지");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("곡 정지");
	}

}
