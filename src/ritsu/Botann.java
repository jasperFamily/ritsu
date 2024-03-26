package ritsu;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

	public    class Botann  extends JFrame implements ActionListener {
		
		public static void main(String[] args) {
			new Botann();	
			
		}
	
		JComboBox<String> comboBox = new JComboBox<String>();
		
		Botann() {
			JButton button = new JButton("OK");
			button.addActionListener(this);
			getContentPane().setLayout(new FlowLayout());
			comboBox.addItem("選択肢１");
			comboBox.addItem("選択肢２");
			comboBox.addItem("選択肢３");
			getContentPane().add(comboBox);
			getContentPane().add(button);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(200, 80);
			setVisible(true);
		}
			
		public void actionPerformed1(ActionEvent e) {
				System.out.println(comboBox.getSelectedItem() + "が選択されています");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自動生成されたメソッド・スタブ
			
		}
	}
	

			
		
			
				
			

