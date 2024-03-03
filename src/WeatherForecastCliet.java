import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class WeatherForecastCliet extends JFrameimplements  {
	

	public static void main(String[] args) {
		new weatherForecastServer();
	}
	
	JTextArea textArea = new JTextArea(5, 20);
	JButton button = new JButton("予報を取得します");
	
	WeatherForecastCliet() {
		setTitle("天気予報受信クライアント");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JScrollPane scrollane = new JScrollPane(textArea);
		Component scrollpane = null;
		getContentpsne().add(scrollpane);
		getContentpsne().add(BorderLayout.SOUTH,button);
		
		setSize(350, 200);
		setVisible(true);
	}
	
	private void setVisible(boolean b) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	private void setSize(int i, int j) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	private Container getContentpsne() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	private void setTitle(String string) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	public void actionperformed(ActionEvent ae) {
		try {
			Socket docket = new Socket("127..0.0.1",5000);
			Socket socket = null;
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String weather = reader.readLine();
			reader.close();
			textArea.append("サーバーから受け取った予報 [" + weather + "]\r\n");
		}   catch(IOException e) {
			  System.out.println(e);
		} 

	}
}