 import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

import javax.imageio.ImageIO;
 
public class G {
	public static void main (String [] args) throws Exception {
		BufferedImage image = ImageIO.read(new  File("minato.jpg"));
		try (FileOutputStream fos = new FileOutputStream("minato.png")) {
			ImageIO.write(image, "png" , fos);
		}
	}

}