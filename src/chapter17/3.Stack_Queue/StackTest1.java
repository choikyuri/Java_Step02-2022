package chapter17.arraylist;

import java.util.Stack;
public class StackTest1 {
      public static void main(String[] args) {
	// TODO Auto-generated method stub
	Object obj;		
	//empty ���û���
	Stack<Object> st = new Stack<Object>();
	
	if(st.empty()){//������ ��� ������
		for(int i=1; i<=3; i++){//���ÿ� ����Ÿ�� 3�� �߰�
			st.push(new String("Hi!"+i));
			System.out.println(" �Է�"+i+ "��° : " + st.peek()); 
		}
	}//of if		
	//System.out.println(st.pop());
	st.pop();//������ ���� 3���
	System.out.println("���� Top�� ��ġ(peek) : "+st.peek());//������ġ�� ������ 2������		
	st.pop();//������ ���� 2���
	System.out.println("���� Top�� ��ġ(Peek) : "+st.peek());//������ġ ������1������	
	st.push(new String("everybody!"));
	System.out.println(st.peek());		
	st.push(new String("Nice Day!"));
	System.out.println(st.peek());
	}
}
