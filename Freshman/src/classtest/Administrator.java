package classtest;

public class Administrator extends Human{
	private int adCode;
	private String devide;
	
	public int getAdCode() {
		return adCode;
	}
	public void setAdCode(int adCode) {
		this.adCode = adCode;
	}
	public String getDevide() {
		return devide;
	}
	public void setDevide(String devide) {
		this.devide = devide;
	}
	
	public Administrator(String name, int birth, String memberId, String memberPw, int adCode, String devide) {
		super(name, birth, memberId, memberPw);
		this.adCode = adCode;
		this.devide = devide;
	}
	
	public void show() {
		System.out.println("_________________________________");
		System.out.println("이름 :" + getName());
		System.out.println("생년월일 :" + getBirth());
		System.out.println("아이디 :" + getMemberId());
		System.out.println("비밀번호 :" + getMemberPw());
		System.out.println("관리자번호 :" + getAdCode());
		System.out.println("직급 :" + getDevide());
	}
	
}
