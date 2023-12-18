package ritsu;

public class Tasibou2<User2> {

	public void play1(int limit) {
		
		// TODO 自動生成されたメソッド・スタブ
		limit = 1;
		System.out.println("***たしぼうゲーム**" + limit );
		int userWin = 0;
		int user2Win = 0;
		
		int  i = 0;
		while (true) {
			e (true); {
				i++;
				if (new Tasibou().play()) {
					userWin += 1;
				} else {
					user2Win += 1;
				
					
				}
				
				if (userWin >= limit || user2Win >= limit) {
					break;
					
					
					
					}
				
				System.out.println("勝負あり：ユーザーの勝ち" + userWin + "勝負あり：ユーザー２の勝ち" + user2Win);
				while(true) {
					
					
					
					
					
				
					User u = new User();
					int userHand = u.pon();
					
					System.out.println("ユーザー：" + getHandMoji(userHand));
					
					
					User u2 = new User();
					int userHand1 = u.pon();
					System.out.print("ユーザー２：" + getHandMoji(userHand1));
					
					if(userHand == userHand1) {
						continue;
						
					}else if ((userHand == 1 && userHand1 == 2)
					||(userHand == 2 && userHand1 == 3)
					||		(userHand == 3 &&  userHand1 == 1)) {
						
				}else if (userHand >=3) {
					System.out.println("ユーザーの勝ち");
					break;
				}else if ((userHand == 1 && userHand1 == 3)
				||      (userHand == 2 &&  userHand1 == 1)
				||		(userHand == 3 && userHand1 == 2)) {
				}else if (userHand >= 3) {
					System.out.println("ユーザー２の勝ち");
				}
					
					
					}
			}
		}
	}


	
	private String getHandMoji(int userHand) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	
	}

	private void e(boolean b) {
		
	}
		
	// TODO 自動生成されたメソッド・スタブ
		
private String getHandMoji1(int hand) {
	
	if (hand == 1) {
		return"左手";
	} else if(hand == 2) {
		return "相手の左手";
} else {
	return "相手の右手";
}
}
}