import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;
import java.awt.event.*;

public class MainMenu extends JFrame
{
    Font title = new Font("Serif",Font.PLAIN,32);
    Font text = new Font("SansSerif",Font.PLAIN,20);
    Font f = new Font("Serif", Font. PLAIN, 52);
    JButton b;
    JButton r;
    JButton q;
    JPanel p;
    Scanner s;

    MainMenu()
    {
        setSize(700, 600);
        Color green = new Color(106, 153, 84);
        setBackground(green);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
          }
        );

        b = new JButton("Start New Game");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            }
        });
        r = new JButton("Resume Game");
        r.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            }
        });
        q = new JButton("Leaderboard");
        q.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            }
        });

        p = new JPanel(null);

        p.add(b);
        b.setBounds(190,180,300,70);

        p.add(r);
        r.setBounds(190, 300, 300, 70);

        p.add(q);
        q.setBounds(190, 420, 300, 70);

        this.add (p);
        p.repaint();
        setResizable (false);
        setBounds (0,0,700,600);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Color blue =  new Color(137, 160, 196);
        Color yellow = new Color(237, 186, 57);
        //sky
        g2.setColor(blue);
        g2.fillRect(0,0,700,410);
        g2.setColor(yellow);
        g2.fillOval(-40,-20,120,120);
        //title
        g2.setColor(Color.WHITE);
        g2.setFont(f); // Set the font to f
        g2.drawString("Climate Change", 175, 120);
            /*g2.setFont(text);
            g2.drawRoundRect(190, 180, 300, 70, 30, 30);
            g2.drawString("Start New Game", 265, 205);
            g2.drawString("Press 'g'", 295, 235);
            g2.drawRoundRect(190, 300, 300, 70, 30, 30);
            g2.drawString("Resume Game", 270, 325);
            g2.drawString("Press 'r'", 290, 355);
            g2.drawRoundRect(190, 420, 300, 70, 30, 30);
            g2.drawString("Leaderboard", 270, 445);
            g2.drawString("Press 'l'", 290, 475);*/
}

    public static void main (String[] args){
        try {
            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName());
        } catch (Throwable e) {
            e.printStackTrace();
        }

        MainMenu m = new MainMenu ();
        m.setVisible (true);
        m.repaint();
    }
}
