import javax.swing.*;
import java.awt.*;

public class Kitchen extends Canvas{
    Color bg =  new Color(201,182,212);
    Color floor = new Color(140, 123, 113);
    Color table = new Color(122, 80, 80);
    Color sBottle = new Color(217, 186, 134);
    Color pBottle = new Color(145, 204, 204);
    Color rBottle = new Color(33, 93, 22);

    CommonGraphics c = new CommonGraphics();

    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        setBackground(bg);

        g.setColor(floor);
        g.fillRect(0,300,700,300);//floor

        c.person(580,340,g);

        g.setColor(table);
        int xTable[] = {200,450,530,280};
        int yTable[] = {360,360,320,320};
        g.fillPolygon(xTable,yTable,4);//table
        int xSTable[] = {450,450,530,530};
        int ySTable[] = {360,370,330,320};
        g.fillPolygon(xSTable,ySTable,4);//table sides
        g2.setStroke(new BasicStroke(10));
        g.drawLine(205,365,445,365);
        g.drawLine(450,365,450,445);//table legs
        g.drawLine(200,365,200,445);
        g.drawLine(530,325,530,405);
        g.drawLine(280,325,280,405);
        //windows
        c.window(80,60,200,140,g);
        //bottles
        g.setColor(sBottle);
        g.drawRect(320,337,8,20);//starbucks bottle
        g.setColor(pBottle);
        g.drawRect(350,337,8,20); //plastic bottle
        g.setColor(rBottle);
        g.drawRect(380,337,8,20);//reusable bottle
        //*bottles fix later*
    }
    public void paintMain(){
        Kitchen s = new Kitchen();
        JFrame f = new JFrame();
        f.add(s);
        f.setSize(700,600);
        f.setVisible(true);
    }
}
