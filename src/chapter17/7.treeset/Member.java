package chapter17;

public class Member implements Comparable<Member>{

	private int memberId;        //회원 아이디
	private String memberName;   //회원 이름
	
	//Comparator<Member>사용할 경우 기본 생성자 반드시 구현
	//public Member() {}
	
	
	public Member(int memberId, String memberName){ //생성자
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {  //
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString(){   //toString 메소드 오버로딩
		return memberName + " 회원님의 아이디는 " + memberId + "입니다";
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Member){
			//매개변수로 넘어온 객체를 다운케스팅
			Member member = (Member)obj;
			if( this.memberId == member.memberId )
				return true;
			else 
				return false;
		}
		return false;
	}
	
	
	@Override
	public int compareTo(Member member) {
		return (this.memberId - member.memberId);   //오름차순
		//return (this.memberId - member.memberId) *  (-1);   //내림 차순
	}
	
	//Comparator<Member>
	/*@Override
	public int compare(Member member1, Member member2) {
		return (member1.memberId - member2.memberId);   //오름차순
		
	}*/
	
}
