import java.awt.*;

public class MainGui2 {
    public static void main(String[] args) {
        Frame f = new Frame("Tutorial Mangan");
        Component text = new TextArea("mangan Karu Uyah");
        Component button = new Button("Tombol");

        f.add(text, BorderLayout.NORTH);
        f.add(text, BorderLayout.SOUTH);
        int width = 300;
        int height = 300;
        f.setSize(width, height);
        f.setVisible(true);

    }
}
