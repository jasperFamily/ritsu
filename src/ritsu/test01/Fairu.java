package ritsu.test01;

import java.io.FileWriter;
import java.io.IOException;

public class Fairu {
	public static void main (String [] args) throws IOException {
		FileWriter fw = new FileWriter("c:\\rpgsave.dat" , true);
		fw.write('A');
		fw.flush();
		fw.close();
	}
}