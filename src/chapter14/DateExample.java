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
		
		SimpleDateFormat sdf=new SimpleDateFormat("yy�� MM�� dd�� hh�� mm�� ss��");
		//System.out.println(sdf);//�޸� ��ġ
		String strNow2=sdf.format(now);
		//�޸�
		//String strnow2=sdf.toString(); //��ü ��ȯ
		System.out.println("----SimpleDateFormat----");
		System.out.println(strNow2);

	}

}
