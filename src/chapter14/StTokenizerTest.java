package chapter14;

import java.util.StringTokenizer;

public class StTokenizerTest {

	public static void main(String[] args) {
		
		String str="Have a Nice Day";
		
		//StringTokenizer(str, "",false)
		//str : ����� String ���ڿ� , "":�ڸ��� ���� ���ڿ�, false:�ڸ��� ���� ǥ�� ����
		StringTokenizer obj=new StringTokenizer(str, " ",false);
		
		//hasMoreTokens(): ���� Token���� Ȯ��
		while(obj.hasMoreTokens()) {
			String t=obj.nextToken();
			System.out.println(t);
		}

	}

}
