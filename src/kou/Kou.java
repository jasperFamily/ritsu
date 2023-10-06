package kou;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Kou {
	public static void main (String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		SimpleDateFormat sdf
		= new SimpleDateFormat("y/M/d");
		
		System.out.println(sdf.format(c.getTime()));
		
		String[] unmei = {"貴方は元気ですね","貴方は普通ですね","貴方は疲れていますね"};
		
		Random r = new Random();
		
		System.out.println(unmei[r.nextInt(3)]);
		
	}
	
		
}