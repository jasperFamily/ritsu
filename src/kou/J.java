package kou;

import java.util.Scanner;

public class J {
	public static void main(String[] sarg) {
		System.out.println("電卓");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("数字を2個入力してください");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		        System.out.println(num1 + num2);
				System.out.println(num1 - num2);
				System.out.println(num1 * num2);
				System.out.println((double)num1 / num2);
			
		
	}

}
