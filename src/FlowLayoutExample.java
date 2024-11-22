import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExample extends JFrame  implements ActionListener {
	public static void main(String[] args) {
		new FlowLayoutExample ();
	}
	
	JButton button1;
	JButton button2;
	
	FlowLayoutExample () {
	    button1 = new JButton("毎日寿司を食べるか");
		button1.addActionListener(this);
		getContentPane().add(BorderLayout.WEST,button1);
		
	    button2 = new JButton("毎日マックを食べるか");
	
	   button2.addActionListener(this );
		getContentPane().add(BorderLayout.EAST,button2);
				
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());
		
		
		setSize(200, 110);
		setVisible(true);
		System.out.println("今から究極の2択を1つ出します(1つだけ選んでください)");
		System.out.println("左上を見て答えてください");
		
		setLocationRelativeTo(null);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == button1) {
	        System.out.println("あなたは「毎日寿司を食べるか」ですね");
	        System.out.println("ちなみに寿司は62%です(死にはしないとおもうけど多分飽きますね)");
			System.out.println("じゃあ、今日から寿司を食べるのであなたが奢ってください");
			System.out.println("これで究極の二択を終わります");
		} else if (ae.getSource() == button2) {
			System.out.println("あなたは「毎日マックを食べるか」ですね");
			System.out.println("ちなみにマックは32%です(毎日食ったら死にますよ)");
			System.out.println("じゃあ、今日からマックを食べるのであなたが奢ってください");
			System.out.println("これで究極に二択を終わります");
		}
		
	}
}
