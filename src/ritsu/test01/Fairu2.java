package ritsu.test01;

import java.io.FileReader;
import java.io.IOException;

public  class Fairu2 {
	public static void main (String [] args) throws IOException {
		FileReader fw = new FileReader("rpgsave.dat");
		System.out.println("すべてのデータを読み込んで表示します");
		int i = fw.read();
		
		while (i != -1) {
			char  c = (char)i;
			System.out.println(c);
			i = fw.read();
		}
		System.out.println("ファイルの上限に到達しました");
	}
}