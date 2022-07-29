package chapter17.treeset;

import chapter17.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		
		Member memberPark = new Member(1003, "¹Ú¼­ÈÍ");
		Member memberLee = new Member(1001, "ÀÌÁö¿ø");
		Member memberSon = new Member(1002, "¼Õ¹Î±¹");
		
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
	
	}
}
