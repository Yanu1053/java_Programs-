package interface123;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/YYYY");
		System.out.println(sdf.format(d));
		System.out.println(d.toString());
		System.out.println("#################################");
		
		//Another way to get date 
		
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdfc=new SimpleDateFormat("M/d/YYYY");
		System.out.println(sdfc.format(cal.getTime()));
		System.out.println(d.toString());
		

	}

}
