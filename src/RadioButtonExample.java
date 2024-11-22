import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public abstract class RadioButtonExample extends JFrame implements ActionListener {
	public static void main(String[] args) {
		new RsdioButtonExample();
	}
	
	JRadioButton rb1 = new JRadioButton("選択１", true);
	JRadioButton rb2 = new JRadioButton("選択２");
	JRadioButton rb3 = new JRadioButton("選択３");
	
	RadioButtonExample() {
		getContentPane().setLayout(new FlowLayout());
		JButton button = new JButton("ok");
		button.addActionListener(this);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		getContentPane().add(rb1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 80);
		setVisible(true);
	}   
	
	public void actionPerformed(ActionEvent e) {
		if (rb1.isSelected()) {
			System.out.println("[選択１]が選択されました");
		}
		if (rb2.isSelected()) {
			System.out.println("[選択２]が選択されました");
		}
		if (rb3.isSelected());
		    System.out.println("[選択３]が選択されました");
	}
}