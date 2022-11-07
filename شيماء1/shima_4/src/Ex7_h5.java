import javax.swing.*;
import java.awt.*;

public class Ex7_h5 {
    public static void main(String[] args) {
        JFrame x= new JFrame();
        x.setSize(400, 400);
        x.setTitle("NameViewer");
        NameComponent component1=new NameComponent();
        x.add(component1);
        x.setVisible(true);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class  NameComponent extends JComponent{
    public void pintComponent (Graphics g)
    {
        Rectangle y=new Rectangle(200,100,200,100);
        Graphics2D g2=(Graphics2D)g;
        g2.setColor(Color.blue);
        g2.fill(y);
        g2.drawString("marym",70,90);
    }
}