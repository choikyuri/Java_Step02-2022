package pk17.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Bingo {
	public static void main(String[] args) 
	{ 
		HashSet<Integer> set = new HashSet<>(); 
		int[][] board = new int[5][5]; 

		for(int i=0; set.size() < 25; i++) { 
			set.add(new Random().nextInt(50) + 1); 
		} 

		// Set구조는 arrayList와 같이 get()메서드를 이용하여 특정 인덱스로 접근		
		// 할수 없기 때문에, 내용을 순차적으로 얻어오기 위해서는
		// iterator라고 하는 반복자를 이용해야 한다.
		Iterator<Integer> it = set.iterator(); 

		for(int i=0; i < board.length; i++) { 
			for(int j=0; j < board[i].length; j++) { 
				board[i][j] = (Integer)it.next(); 
				System.out.printf("%02d ", board[i][j]); 
			} 
			System.out.println(); 
		} 
	} 
}
