package kou;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel
  implements MouseListener, MouseMotionListener {
	  public MyPanel() {
		  addMouseListener(this);
		  addMouseListener(this);
	  }
	  
	  public void mouseClicked(MouseEvent e) {
		  System.out.println("マウスがクリックされました(" + e.getX() + ", " + e.getY() + ")");
	  }
	  
	  public void mouseEntered(MouseEvent e) {
		  System.out.println("マウスがパネル内に入りました");
	  }
	  
	  public void mouseExited(MouseEvent e) {
		  System.out.println("マウスがパネルの外にでました");
	  }
	  
	  public void mouseRressed(MouseEvent e) {
		  System.out.println("マウスのボタンが押されました");
	  }
	  
	  public void mouseReleased(MouseEvent e) {
		  System.out.println("マウスのボタンが離されました");
	  }
	  
	  public void mouseDragged(MouseEvent e) {
		  System.out.println("マウスがドラックされました (" + e.getX() + ", " + e.getY() + ")");
	  }
	  
	  public void mouseMoved(MouseEvent e) {
		  System.out.println("マウスが移動しました (" + e.getX() + ", " + e.getY() + ")");
	  }

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

  }
  
  public class MouseEventExample extends JFrame {
	  public static void main(String[] args) {
	    new MouseEventExample();
	}   
	  
	MouseEventExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(new MyPanel());
		setSize(300, 200);
		setVisible(true);
	}
  }
  