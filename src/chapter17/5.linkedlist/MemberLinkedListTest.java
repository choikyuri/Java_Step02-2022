package collection.Linkedlist;

import collection.*;

public class MemberLinkedListTest {

	public static void main(String[] args) {

MemberLinkecList memberArrayList = new MemberLinkecList();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		
		memberArrayList.showAllMember();
		
		Member memberkim = new Member(1003, "김서연");
		memberArrayList.addMember(memberkim);
		System.out.println("---------------------");
		memberArrayList.removeMember(1004);
		System.out.println("---------------------");
		System.out.println();
		memberArrayList.showAllMember();
	}

}
