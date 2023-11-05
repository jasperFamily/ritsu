package ritsu;

public class Jannkenn2 {
	
	public void play(int limit) {
		;
		limit = 3;
		System.err.println("****じゃんけん****" + limit + "回勝負");
		
		System.out.println("三回勝負");
		
	int userWin = 0;
	int cpuwin = 0;
	
	int i = 0;
	 while(true) {
	e (true); {
		i++;
		if (new Jannkenn().play()) {
			userWin +=1;
		}else {
			cpuwin += 1;
		}
		if (userWin >= limit || cpuwin >= limit) {
			break;
			
		}
		
		
		System.out.println("勝負あり：ユーザの勝ち" + userWin + "勝負ありcpuの勝ち" + cpuwin);
	}
		
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
			System.out.println("ユーザーの勝ち");
			break;
	} else if ((userHand == 1 && cpuHand == 3)
			||	(userHand == 2 && cpuHand == 1)
			||  (userHand == 3 && cpuHand == 2))  {
		     	} else if (userHand >=3) {
		System.out.println("CPUのかち");
		break;
	
		}
		}
	 }
}
		
	
	private void e(boolean b) {
		// TODO 自動生成されたメソッド・スタブ
		
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