package chapter14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date now=new Date();
		System.out.println(now);
		String strNow=now.toString();
		System.out.println("------------Date-------------");
		System.out.println(strNow);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yy년 MM월 dd일 hh시 mm분 ss초");
		//System.out.println(sdf);//메모리 위치
		String strNow2=sdf.format(now);
		//메모리
		//String strnow2=sdf.toString(); //객체 반환
		System.out.println("----SimpleDateFormat----");
		System.out.println(strNow2);

	}

}
