package kou;

import java.awt.BorderLayout;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sample extends JFrame {
    private static final long serialVersionUID = 8L;

    public static void main(String args[]) {
        Sample sample1 = new Sample();
        sample1.setBounds(300,300,300,300);
        sample1.setVisible(true);
    }

    public Sample() {
        TimeLabel label = new TimeLabel();
        this.add(label,BorderLayout.CENTER);
        System.out.println("時計");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class TimeLabel extends JLabel {
    private DateFormat format;
    
    public TimeLabel(){
        this.setFont(new Font("Dialog",Font.BOLD,24));
        format = new SimpleDateFormat("HH:mm:ss");
        Timer t = new Timer();
        t.schedule(new TimerLabelTask(), 100,130);
    }
    
    public void setTime(){
        Calendar calendar = Calendar.getInstance(Locale.JAPAN);
        this.setText(format.format(calendar.getTime()));
    }
    
    class TimerLabelTask extends TimerTask {
        
        public void run(){
            setTime();
        }
    }
}
