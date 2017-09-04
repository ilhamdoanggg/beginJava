import javafx.stage.WindowEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;

public class DrawPolygon2 extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Polygon p = new Polygon();
        for (int i = 0; i < 4 ; i++) p.addPoint((int) (100 + 50 * Math.cos(i*2*Math.PI/5)), (int)(100+50*Math.sin(i*2*Math.PI/5)));
        g.drawPolygon(p);

    }

    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.getContentPane().setBackground(Color.gray);
        jframe.setTitle("DrawPoly");
        jframe.setSize(350, 250);
        jframe.addWindowFocusListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        Container contentPane = jframe.getContentPane();
        contentPane.add(new Panel());
        jframe.show();
    }
}
