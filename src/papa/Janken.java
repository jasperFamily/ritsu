package papa;

import ritsu.Cpu;
import ritsu.User;

public class Janken {

	public static void main(String[] args) {
		int limit = 3;
		System.err.println("じゃんけん" + limit + "回勝負");
		int userWin = 0;
		int cpuWin = 0;

		int i = 0;
		while (true) {
			i++;
			System.out.println(i+"回目の勝負");
			if (new Janken().play()) {
				userWin += 1;
			} else {
				cpuWin += 1;
			}

			if (userWin >= limit || cpuWin >= limit) {
				break;
			}
		}
		System.out.println("勝負あり：ユーザー勝利数=" + userWin + " CPU勝利数=" + cpuWin);

	}

	// 1回のじゃんけんを行って、勝敗をtrue falseで戻す。
	public boolean play() {

		while (true) {
			User u = new User();
			int userHand = u.pon();

			System.out.print("ユーザー:" + getHandMoji(userHand));

			Cpu c = new Cpu();
			int cpuHand = c.pon();
			System.out.println("CPU:" + getHandMoji(cpuHand));

			if (userHand == cpuHand) {
				System.out.println("あいこ");
				continue;
			} else if ((userHand == 1 && cpuHand == 2)
					|| (userHand == 2 && cpuHand == 3)
					|| (userHand == 3 && cpuHand == 1)) {
				System.out.println("勝ち");
				return true;
			} else if ((userHand == 1 && cpuHand == 3) ||
					(userHand == 2 && cpuHand == 1)
					|| (userHand == 3 && cpuHand == 2)) {
				System.out.println("負け");
				return false;
			}
		}

	}

	private String getHandMoji(int hand) {
		if (hand == 1) {
			return "グー";
		} else if (hand == 2) {
			return "チョキ";
		} else {
			return "パー";

		}
	}

}
