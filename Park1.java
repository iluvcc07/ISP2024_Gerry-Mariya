/*
Name: Gerry
Date:March 30
Teacher: Mr Gugliemi
Description: Park Scene (Scene 5), player is asked between
 */
import javax.swing.*;
import java.awt.*;
public class Park1 extends Canvas{
    CommonGraphics cg = new CommonGraphics();
    Color sky =  new Color(137, 160, 196, 255);
    Color grass = new Color (79, 134, 8);
    Color path = new Color (183, 153, 96);


    public void paint(Graphics g){
        setBackground(sky);
        g.setColor(grass);
        g.fillRect(0,350,700,250);//grass

        cg.tree(160,240,0.8,'t',g);//tress, background
        cg.tree(50,160,1.4,g);
        cg.tree(280,200,1.2,g);
        cg.tree(620,220,1,'t',g);

        g.setColor(path);
        g.fillRect(0,400,700,80);//path

        cg.tree(590,520,1.2,g);
        cg.person(460,260,g);

        g.setColor(Color.GRAY);
        cg.fillTriangle(440,360,480,380,450,386,g);//garbage

    }
    public void paintMain(){//acts like static main method, the method that will be called in the driver class
        Park1 s = new Park1();
        JFrame f = new JFrame();
        f.add(s);
        f.setSize(700,600);
        f.setVisible(true);
    }
}
