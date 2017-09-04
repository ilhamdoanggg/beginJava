import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvass extends JComponent {
    String s ="MESSAGE";
    int x = 45;
    int y = 45;
    public void paint(Graphics g){
     g.drawRect(10,10,200,200);
     g.setColor(Color.red);
     g.drawString(s,x,y);
    }
}
public class MyCanvas{
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30,30,300,300);
        window.getContentPane().add(new MyCanvass());
        window.setVisible(true);
    }
}
