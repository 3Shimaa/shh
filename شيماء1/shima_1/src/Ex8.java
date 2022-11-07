import javax.swing.*;
import java.awt.*;

public class Ex8 extends JComponent {
    public void paintComponent(Graphics g){
        Rectangle r=new Rectangle(100,100,100,100);
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.CYAN);
        g2.fill(r);
    }
}
