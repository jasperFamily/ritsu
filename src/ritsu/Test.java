package ritsu;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		int rituVictory = 0;
		int  cpuVictory = 0;

		int r1 = junken();
		if(r1==1) {
//			rituVictory +=1;
			rituVictory = rituVictory + 1;
		}
		int r2 = junken();
		if(r2 ==1) {
			rituVictory +=1;
		}
		int r3 = junken();
		if(r3 ==1) {
			rituVictory +=1;
		}

//		if(r1 == 1&&r2== 1 && r3==1) {
		if(rituVictory >=3 ) {
			System.out.println("おわり　律の勝ちに");
		}
		int r4 = junken();
		if(r4 ==1) {
			rituVictory +=1;
		}
		if(rituVictory >=3 ) {
			System.out.println("おわり　律の勝ちに");
		}

//		if(r1 == 1 && r2== 1 && r3==1) {
//			System.out.println("おわり　律の勝ちに");
//		}


		int r5 = junken();
		int r6 = junken();


		////////
		///////

		while(rituVictory >= 3||cpuVictory >= 3) {
			int r = junken();
			if(r == 1) {
				rituVictory=+1;
			}else {
				cpuVictory=+1;
			}
		}
		if(rituVictory>=3) {
			System.out.println("おわり　律の勝ちに");
		}else {
			System.out.println("おわり　cpuの勝ちに");
		}



	}

	public static int junken() {


		return 1;
	}

}
