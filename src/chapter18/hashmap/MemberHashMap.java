package map;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	//construct
	public MemberHashMap()
	{
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member){
		
		hashMap.put(member.getMemberId(), member);
		
	}
	
	public boolean removeMember(int memberId){
		
		if(hashMap.containsKey(memberId)){
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember(){
		//keySet():key들만 가져옴 / iterator():순환됨
			Iterator<Integer> ir = hashMap.keySet().iterator();
			//hasNext() : 자동으로 다음 순서를 가르침 즉 뒤에 데이터가 있다면
			while (ir.hasNext()){
				int key = ir.next();//key를 저장
				Member member = hashMap.get(key);//key를 꺼내서 저장
			System.out.println(member);
		}	
		System.out.println();
	}
}
