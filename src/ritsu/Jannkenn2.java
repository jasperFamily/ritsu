package ritsu;

public class Jannkenn2 {
	
	public void play() {
		System.out.println("****じゃんけん****");
		System.out.println("三回勝負");
		
		
		
		
		
		
		while(true) {
			
		
		
		
		User u = new User();
		int userHand = u.pon();
		
		System.out.print("ユーザー:" +  getHandMoji(userHand));
		
		Cpu c = new Cpu ();
		int cpuHand = c.pon();
		System.out.println("CPU:" + getHandMoji(cpuHand));
		
		if(userHand == cpuHand) {
			System.out.println("あいこ");
			continue;
			
		}else if 	((userHand == 1 &&  cpuHand == 2)
		  ||           (userHand == 2 && cpuHand == 3)
		  ||         (userHand == 3 && cpuHand == 1)) {
            } else if (userHand >= 3) {
			System.out.println("ゲーム終了ユーザーのかち");
			break;
	} else if ((userHand == 1 && cpuHand == 3)
			||	(userHand == 2 && cpuHand == 1)
			||  (userHand == 3 && cpuHand == 2))  {
		     	} else if (userHand >=3) {
		System.out.println("ゲーム終了CPUのかち");
		break;
	}
}
}
		
	
	private String getHandMoji(int hand) {
		if (hand == 1) {
			return"グー";
		} else if(hand == 2) {
			return "チョキ";
	} else {
		return "パー";
			
		}
	}

}