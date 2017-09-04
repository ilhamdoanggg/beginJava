import javax.swing.*;
import java.awt.*;

public class GuiRectangle extends JPanel {
    public void paint(Graphics g ){
        g.setFont(new Font("", 0, 100));
        FontMetrics fm = getFontMetrics(new Font("", 0, 100));
        String s ="ILHAM";
        int x = 5;
        int y = 5;

        for (int i =0; i < s.length();i++){
            char c = s.charAt(i);
            int h = fm.getHeight();
            int w = fm.charWidth(c);

            g.drawRect(x,y,w,h);
            g.drawString(String.valueOf(c),x,y+h);
            x= x + w;
        }
    }

    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setContentPane(new GuiRectangle());
        jframe.setSize(500, 500);
        jframe.setVisible(true);
    }
}
