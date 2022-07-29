package chapter18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamMain {

	public static void main(String[] args) {
		
		List<String> sList=new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		//람다식
		Stream<String> stream=sList.stream();
		stream.forEach(s->System.out.println(s +" "));
		System.out.println();
		
		//for
		for(String s:sList) {
			System.out.println(s+" ");
		}
		System.out.println();
		
		System.out.println("=====정렬후=====");
		sList.stream().sorted() //정렬 Comparator
		.forEach(s->System.out.println(s +" ")); //for
		System.out.println();
		System.out.println("=====map=====");
		sList.stream().map(s->s.length()).forEach(n->System.out.println(n +" "));
		System.out.println();
		sList.stream().filter(s->s.length()>=5).forEach(n->System.out.println(n +" "));

	}

}







