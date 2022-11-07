import javax.swing.*;
import java.awt.*;

public class Ex2_h5 {
    public static void main(String[] args) {
        JFrame x= new JFrame();
        x.setSize(500, 500);
        x.setTitle("TwoSquarViewrr");
        TwoSquarComponent component=new TwoSquarComponent();
        x.add(component);
        x.setVisible(true);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class TwoSquarComponent extends JComponent{
   public void pintComponent (Graphics g)
    {
        Rectangle y=new Rectangle(200,100,200,100);
        Rectangle y2=new Rectangle(200,100,200,100);
        Graphics2D g2=(Graphics2D)g;
        g2.setColor(Color.pink);
        g2.fill(y);
        g2.setColor(new Color(0xA3E763C8, true));
        g2.fill(y2);

    }
}