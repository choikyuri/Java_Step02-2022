package chapter17.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();
	
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		
		for(int j=0; j<list.size(); j++) {
			Board board = list.get(j);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
		
		list.remove(2);
		list.remove(3);
		System.out.println("---------------------------");
		for(int i=0; i<list.size(); i++) {
			Board board1 = list.get(i);
			System.out.println(board1.subject + "\t" + board1.content + "\t" + board1.writer);
		}
	}
}


