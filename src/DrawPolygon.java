import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawPolygon extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Polygon p = new Polygon();
        for (int i = 0; i < 5; i++)p.addPoint((int)(100+50 *Math.cos(i * 2 * Math.PI /5)), (int) (100 + 50 * Math.sin(i*2*Math.PI / 5)));
        g.drawPolygon(p);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Polygon");
        frame.setSize(350, 250);

        frame.addWindowFocusListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        Container contenPane =frame.getContentPane();
        contenPane.add(new DrawPolygon());
        frame.setVisible(true);
    }
}
