package kou;
//おみくじ
import java.util.Random;

public class Omikuzi {
	public static void main(String[] sarg) {
		Random r = new Random();
		
		
		int num = r.nextInt(100);
		
		if(num >= 0 && num <= 10) {
			
			System.out.println("大吉🐰");
		}   else if (num >= 11 && num <= 80) {
			System.out.println("中吉🐈");
		}   else if (num >= 50 && num <= 99) {
		    System.out.println("吉🐭");
		}   else if (num >= 55 && num <= 70) {
			
		
		}
	}

}
