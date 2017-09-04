import javax.swing.*;
import java.awt.*;

public class MaenPanel extends JPanel {
    public static void main(String[] a) {
        JFrame f = new JFrame();
        f.setSize(400,400);
        f.add(new MaenPanel());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void paint(Graphics g){
        g.fillRect(5,15,50,75);
    }
}
