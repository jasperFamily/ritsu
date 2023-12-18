package ritsu;

import java.util.Scanner;

public class Tasibouyuza {
	
	public static void main(String[] args) {
		int x = new Tasibouyuza().pon();
System.out.println(x);
	}
	
	public int pon() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1:　左手");
		int hand111 = scan.nextInt();	
		System.out.println("左手");
		return hand111;
	}

	public void play2(int i) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}