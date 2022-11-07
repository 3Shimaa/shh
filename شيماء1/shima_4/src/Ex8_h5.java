import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ex8_h5 {
    public static void main(String[] args) {
        JFrame x = new JFrame();
        x.setSize(300, 300);
        x.setTitle("Traffic");
        Trafficcomponent component1 = new Trafficcomponent();
        x.add(component1);
        x.setVisible(true);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class   Trafficcomponent extends JComponent{
  public void pintComponent (Graphics g)
    {
        Rectangle y=new Rectangle(250,100,250,100);
        Graphics2D g2=(Graphics2D)g;
        g2.setColor(Color.black);
        g2.fill(y);
        Ellipse2D.Double y2=new Ellipse2D.Double(200,100,200,100);
        g2.setColor(Color.red);
        g2.fill(y2);
        Ellipse2D.Double y3=new Ellipse2D.Double(200,100,200,100);
        g2.setColor(Color.yellow);
        g2.fill(y3);
        Ellipse2D.Double y4=new Ellipse2D.Double(200,100,200,100);
        g2.setColor(Color.green);
        g2.fill(y4);
    }
}