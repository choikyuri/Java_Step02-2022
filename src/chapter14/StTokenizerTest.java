package chapter14;

import java.util.StringTokenizer;

public class StTokenizerTest {

	public static void main(String[] args) {
		
		String str="Have a Nice Day";
		
		//StringTokenizer(str, "",false)
		//str : 사용할 String 문자열 , "":자르는 기준 문자열, false:자르는 기준 표시 여부
		StringTokenizer obj=new StringTokenizer(str, " ",false);
		
		//hasMoreTokens(): 다음 Token존재 확인
		while(obj.hasMoreTokens()) {
			String t=obj.nextToken();
			System.out.println(t);
		}

	}

}
