package ritsu;
import java.io.ByteArrayOutputStream;
public class Fairu6 {
	public static void main (String[] args) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(65);
		baos.write(66);
		byte[] data = baos.toByteArray();
		for (byte b : data) {
			System.out.println(b);
		}
		
	}

}
