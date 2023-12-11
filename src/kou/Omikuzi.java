package kou;

//おみくじ
import java.util.Random;

public class Omikuzi {

	public static void main(String[] sarg) {
		Random r = new Random();

		System.out.println("今からおみくじを引きます");

		String result = omikuji();

		System.out.println("僕は" + result + "でした");

	}

	public static String omikuji() {

		Random r = new Random();
		int num = r.nextInt(100);

		if (num <= 10) {

			return ("大吉🐰");
		} else if (num <= 30) {
		    return("中吉🐈");
		} else {
			return("吉");

		}
	}

}
