package ritsu;

import java.io.FileWriter;
import java.io.IOException;

public class Fairu4 {
	public static void main(String [] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("rpgsave.dat",true);
			fw.write('A');
			fw.flush();
		} catch (IOException e) {
			System.out.print("ファイルの書き読みエラーです");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e2) {	}
			}
			
		}
	}
}