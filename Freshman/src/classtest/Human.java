package classtest;

public class Human {
	private String name;
	private int birth;
	private String memberId;
	private String memberPw;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	
	public Human(String name, int birth, String memberId, String memberPw) {
		super();
		this.name = name;
		this.birth = birth;
		this.memberId = memberId;
		this.memberPw = memberPw;
	}
	
	public void show() {
		System.out.println("_________________________________");
		System.out.println("이름 :" + getName());
		System.out.println("생년월일 :" + getBirth());
		System.out.println("아이디 :" + getMemberId());
		System.out.println("비밀번호 :" + getMemberPw());
	}

}
