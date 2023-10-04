package ritsu;

import java.util.Scanner;

public class User {
	
	public int pon() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1:　グー:　2:チョキ: 3: パー ");
		int hand = scan.nextInt();
		
		return hand;
	}

}
