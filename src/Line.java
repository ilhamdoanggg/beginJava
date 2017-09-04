import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Line2D;

public class Line extends JApplet{
    public void init(){
        setBackground(Color.gray);
        setForeground(Color.gray);
    }
    public void paint (Graphics g ){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(Color.black);
        int x = 5;
        int y = 7;
        g2.draw(new Line2D.Double(x,y, 200,200));
        g2.drawString("line", x, 250);
    }

    public static void main(String s[]) {
        JFrame f = new JFrame("Line");
        f.addWindowFocusListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        JApplet applet = new Line();
        f.getContentPane().add("Center", applet);
        applet.init();

        f.pack();
        f.setSize(new Dimension(300,300));
        f.setVisible(true);
    }
}
