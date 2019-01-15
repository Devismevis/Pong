import javax.swing.*;
import java.awt.*;
import java.applet.*;
public class view {
private Image sp1;
private Image sp2;
private MediaTracker tracker;


    public static void run() {
    	JFrame fenster = new JFrame("KingPong ");
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("123gdhn6hqwgthqw42u4");
        tracker = new MediaTracker(this);
        
        
   
        fenster.setSize(1920,1800);
        fenster.getContentPane().setBackground( Color.black );
        fenster.setVisible(true);
        
        
    }

}