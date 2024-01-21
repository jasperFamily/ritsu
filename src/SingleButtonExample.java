import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SingleButtonExample extends JFrame implements ActionListener {
	public static void main(String [] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setVisible(true);
		new SingleButtonExample();
		
	}
	
	SingleButtonExample() {
		JButton button = new JButton("ボタン");
		button.addActionListener(this);
		getContentPane().add(button);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 100);
	}
	
	public void actionPerformed(ActionEvent ae) {
		System.out.println("ボタンが押されました");
	}

	public void actionPerformed1(ActionEvent e) {
		new SingleButtonExample();
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
}