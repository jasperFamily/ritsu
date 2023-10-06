package ritsu;

import java.util.Random;

public class Cpu {
	public int pon() {
		Random r = new Random();
		int hand = r.nextInt(3) +1;
		return hand;
	}

}
