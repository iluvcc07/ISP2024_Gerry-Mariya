import javax.swing.*;
import java.awt.*;

public class Bedroom extends JFrame
{
    Color wall = new Color(201, 182, 212);
    Color floor = new Color(92, 65, 41);
    Color sky =  new Color(137, 160, 196);
    Color bed = new Color(207, 182, 138);
    Color rug = new Color(43, 44, 130);
    Color rugB = new Color(27, 28, 82);
    Color pillow = new Color(223, 247, 247);
    JPanel p;

    Bedroom()
    {
        setSize(700, 600);
        p = new JPanel(null);
        p.repaint();
        setResizable (false);
        setBounds (0,0,700,600);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        setBackground(wall);
        g2.setColor(floor);
        g2.fillRect(0,400,700,600);
        //window
        BasicStroke s = new BasicStroke(5);
        g2.setStroke(s);
        g2.setColor(sky);
        g2.fillRect(240,90,230,225);
        g2.setColor(floor);
        g2.drawRect(240,90,230,225);
        g2.drawLine(240,203,470,203);
        g2.drawLine(355,90,355,315);

        //carpet
        g2.setColor(rug);
        int XP[]={52,142,542,452};
        int YP[]={560,450,450,560};
        g2.fillPolygon(XP,YP,4);
        BasicStroke bs = new BasicStroke(15);
        g2.setStroke(bs);
        g2.setColor(rugB);
        g2.drawPolygon(XP,YP,4);

        //bed
        g2.setColor(bed);
        //headboard
        BasicStroke bbs = new BasicStroke(5);
        g2.setStroke(bbs);
        g2.drawLine(132,510,132,455);
        int x[]={130,200,200,130};
        int y[]={475,395,340,420};
        g2.fillPolygon(x,y,4);
        //sheets
        g2.setColor(sky);
        int xP[]={132,202,512,442};
        int yP[]={470,390,390,470};
        g2.fillPolygon(xP,yP,4);
        g2.fillRect(132,470,310,30);
        //pillow
        g2.setColor(pillow);
        int xPP[]={160,200,190,150};
        int yPP[]={465,415,370,420};
        g2.fillPolygon(xPP,yPP,4);
        //backboard
        g2.setColor(bed);
        g2.drawLine(444,510,444,470);
        g2.drawLine(508,390,508,430);
        int xPo[]={442,510,510,442};
        int yPo[]={450,370,405,485};
        g2.fillPolygon(xPo,yPo,4);
    }

    public static void main (String[] args){
        try {
            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName());
        } catch (Throwable e) {
            e.printStackTrace();
        }

        Bedroom m = new Bedroom();
        m.setVisible (true);
        m.repaint();
    }

}
