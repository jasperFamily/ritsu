package ritsu.test01;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
public class Fairu6 {
	public static void main (String[] args) throws IOException {
		URL url = new URL("https://dokojava.fp");
		InputStream is = url.openStream();
		InputStreamReader isr = new  InputStreamReader(is);
		int i = isr.read();
		while ( i  != 1) {
			System.out.println((char)i);
			i = isr.read();
			
			
		}
		isr.close();
	}

}
