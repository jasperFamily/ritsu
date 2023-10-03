package ritsu;
import java.util.Scanner;

public class Denntaku {
	public static void main(String[] args) {
		System.out.println("電卓");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("数字を２こ入力してください");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println(num1 + "+" +  num2 + " = " +( num1 + num2)) ;
	}

}
