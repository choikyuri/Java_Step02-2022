package pk17.hashset;

import java.util.HashSet;
import java.util.Random;

public class SetEx {

	public static void main(String[] args) {
		// Set�� ���� �ߺ��� ������� �ʴ´�.
				//  - HashSet : ������ �ȵ�
				//  - TreeSet : ��������		
				HashSet<Integer> hs = new HashSet<Integer>();

				while(true){
					//���� �߻��ϱ�
					int v = (int)(Math.random()*45+1);
					//int v = new Random().nextInt(45) + 1;

					hs.add(v);

					if(hs.size() >= 6)
						break;
				}
				System.out.println(hs);
	}
}