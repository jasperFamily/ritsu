import java.util.Scanner;

public class Dentak {
	public static void main(String[] sarg) {
		System.out.println("あなたの年齢を当てます！");
		Scanner scan = new Scanner(System.in);
		System.out.println("1～９のなかから好きな数字をひとつ選んで入力してください");
		int num1 = scan.nextInt();
		System.out.println("つぎにその数に５をかけるとこの答えになりますよね！！");

		int num2 = num1 * 5;
		System.out.println(num1 + "×" + 5 + "=" +(num2));
		System.out.println("つぎにその答えに90をたすと・・・");
		
		int num3 = num2+ 90;
		System.out.println(num3 );
		System.out.println("その答えに２０をかけるとこの答えになります");

		int num4 = num3 * 20;
		System.out.println(num1 * 5 + 90 +"×" + 20 + "=" +num4);
		
		System.out.println("つぎに223をたすと・・・");
		int num5 = num4 + 223;
	    System.out.println(num4 + "+" + 223 + "=" +num5);
		System.out.println("最後にその答えに生まれた西暦を引いてください");
		System.out.println("ここに入力してください");
		int num6 = scan.nextInt();
		int num7 = num6 - num5;
		System.out.println(num5 + "-" + num6 + "=" +num7);
		System.out.println("十の位があなたが選んだ好きな数字で、１０か１のくらいは貴方の現在の年齢ですね");
	}

}
 