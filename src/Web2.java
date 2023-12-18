import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Web2 {
	public static void main(String[] args) throws Exception {
		URL url = new  URL("https://dokojava.jp/favicon.ico");    
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream("dj.ico");
		int i = is.read();
		while (i != -1) {
			os.write((byte)i);
			i = is.read();
			
		}
		is.close();
		os.flush();
		os.close();
	}

}
