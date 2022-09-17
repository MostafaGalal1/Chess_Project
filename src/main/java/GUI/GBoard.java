package GUI;
import java.awt.*;
import javax.swing.*;

public class GBoard extends Canvas{

    public void paint(Graphics graphic) {
        Toolkit tool = Toolkit.getDefaultToolkit();
        Image img = tool.getImage("src/main/Assets/k.png");
        graphic.drawImage(img, 0,0,this);
    }

    public static void main(String[] args){
        GBoard m = new GBoard();
        JFrame frame = new JFrame("Chess");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        frame.setVisible(true);

        frame.add(m);
        frame.setSize(494,516);
        frame.setVisible(true);
    }
}
