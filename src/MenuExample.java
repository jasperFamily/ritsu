import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuExample extends JFrame implements ActionListener {
	
	public static void main(String[] args) {
		new MenuExample();
	}
	
	JMenuBar menuBar = new JMenuBar();
	JMenu menuFile = new JMenu("ファイル");
	JMenuItem menuOpen = new JMenuItem("開く");
	JMenuItem menuExit = new JMenuItem("終了");
	
	MenuExample() {
		menuFile.add(menuOpen);
		menuFile.add(menuExit);
		menuBar.add(menuBar);
		menuOpen.addActionListener(this);
		menuExit.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 150);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menuOpen) {
			System.out.println("「開く」が選択されました");
		}   else if (e.getSource() == menuExit) {
			
			
				
			
		}
	}
}