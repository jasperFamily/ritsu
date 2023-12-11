package kou;
import java.util.Scanner;

public class Bosu {
	public static void main(String[] sarg) {
		Scanner acan = new Scanner(System.in);
		System.out.println("今からボスと戦います。");
		System.out.println("ボスのHPは100です");
		 int bosHp = 100;
		
		 System.out.println("自分のHPは60です");
		 int kouHp = 60;
		  
		  System.out.println("なぞなぞに答えられたらボスにhp20攻撃");
		  System.out.println("答えられなかったらhp20食らう");
		  System.out.println("5門出す");
		  System.out.println("第一門　祖父とボール遊びをしましたなにをしたでしょう");
		  System.out.println("ここから入力せよ");
		  
		  
		  //int num = acan.nextInt();
		  
		  String ansewear = acan.next();
		  
		  int okKazu = 0;
		  
		  if(ansewear.equals("ソフトボール")) {
			  System.out.println("ok");
			  bosHp += -20;
		  }else {
			  kouHp += -20;
			  System.out.println("ng");
		  }
		  
		  System.out.println("kou = " + bosHp + "ボスHP="+bosHp);
		  System.out.println("第二問　とらっくでりんごとバナナを積んだひとがいました。道を曲がるときになにをおとしたでしょう");
		  System.out.println("ここから入力せよ");
		  
		  String ansewear0 = acan.next();
		  
		  int okkazu = 0;
		  
		  if(ansewear0.equals("スピード")) {
			  System.out.println("ok");
			  bosHp += -20;
		  }else {
			  kouHp += -20;
			  System.out.println("ng");
		  }
		  System.out.println("kou = " + bosHp + "ボスHp="+bosHp);
		  System.out.println("第三問　バスに8人のっていました。そのうち3人おりました。残りは何人ですか");
		  System.out.println("ここから入力せよ");
		  
		  String ansewear1 = acan.next();
		  
		  int okkazu1 = 0;
		  
		  if(ansewear1.equals("4人")) {
			  System.out.println("ok");
			  bosHp += -20;
		  }else {
			  kouHp += -20;
			  System.out.println("ng");
		  
		  System.out.println("kou = " + bosHp + "ボスHp=" +bosHp);
		  System.out.println("第四問　今何時");
		  System.out.println("ここから入力せよ");
		  
		  String ansewear2 = acan.next();
		  
		  int okkazu2 = 0;
		  
		  if (ansewear2.equals("2文字"));
		  System.out.println("ok");
		  bosHp += -20;
		  } 
		  kouHp += -20;
		  System.out.println("ng");
		  
		  System.out.println("kou = " + bosHp + "ボスHp=" +bosHp);
		  }
	
	{  
	}
	

}
