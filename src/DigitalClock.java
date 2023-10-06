import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.String;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class DigitalClock extends JFrame {
    final static int C00 = 1000;

    public DigitalClock() {
        DrawPanel L00 = new DrawPanel();
        add(L00);

        new Timer(C00, L00).start();
    }

    public static void main(String[] A00) {
        Toolkit.getDefaultToolkit().setDynamicLayout(true);

        DigitalClock L00 = new DigitalClock();
        L00.setTitle("しげデジタル時計");
        L00.setDefaultCloseOperation(EXIT_ON_CLOSE);
        L00.setBackground(Color.white);
        L00.setSize(700, 300);
        L00.setVisible(true);
    }
}

class DrawPanel extends JPanel implements ActionListener {

    public DrawPanel() {
        setBackground(Color.white);
    }

    public void actionPerformed(ActionEvent A00) {
        repaint();
    }

    public void paintComponent(Graphics A00) {
        super.paintComponent(A00);

        String L00 = String.format("%1$tp %1$tI:%1$tM:%1$tS", new Date());

        FontMetrics L01 = A00.getFontMetrics();

        A00.drawString(L00, (getWidth() - L01.stringWidth(L00)) / 2,
                (getHeight() + L01.getAscent() - L01.getDescent()) / 2);
    }
}