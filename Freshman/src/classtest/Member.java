package classtest;

public class Member extends Human {

	private int memberCode;
	private String membership;
	
	public int getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(int memberCode) {
		this.memberCode = memberCode;
	}
	public String getMembership() {
		return membership;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}
	
	public Member(String name, int birth, String memberId, String memberPw, int memberCode, String membership) {
		super(name, birth, memberId, memberPw);
		this.memberCode = memberCode;
		this.membership = membership;
	}

	public void show() {
		System.out.println("_________________________________");
		System.out.println("이름 :" + getName());
		System.out.println("생년월일 :" + getBirth());
		System.out.println("아이디 :" + getMemberId());
		System.out.println("비밀번호 :" + getMemberPw());
		System.out.println("회원번호 :" + getMemberCode());
		System.out.println("멤버십 :" + getMembership());
	}
	
}
