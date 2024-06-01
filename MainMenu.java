import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class MainMenu extends JFrame
{
    Font title = new Font("Serif",Font.PLAIN,32);
    Font text = new Font("SansSerif",Font.PLAIN,20);
    Font f = new Font("Serif", Font. PLAIN, 52);
    Color blue =  new Color(137, 160, 196);
    Color yellow = new Color(237, 186, 57);
    Color green = new Color(106, 153, 84);
    JButton b;
    JButton r;
    JButton q;
    JButton co;
    JTextField u;
    JPanel p;
    JFrame jf;
    boolean newGame = false;
    boolean resumeGame = false;
    boolean leaderboard = false;
    boolean user1 = false;
    boolean g;
    String user;
    BufferedReader reader;
    File file = new File("Usernames");
    Bedroom bedroom = new Bedroom();

    MainMenu()
    {
        setSize(700, 600);
        setBackground(green);
        setResizable (false);
        setBounds (0,0,700,600);
        jf = new JFrame();

        p = new JPanel(null);

        jf.add(p);

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        addWindowListener(new WindowAdapter()
      {
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
                newGame = true;
                b.setVisible(false);
                r.setVisible(false);
                q.setVisible(false);


                jf.setVisible(true);

                u = new JTextField();
                co = new JButton("Press After You Enter Your Username");
                co.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        user1=true;
                        u.addActionListener(this);
                        user = u.getText();

                        u.addActionListener(this);
                        user = u.getText();

                        //checks if entered username has already been used
                        try {
                            reader = new BufferedReader(new FileReader(file));
                            String line = reader.readLine();

                            while (line != null) {
                                if (user.equals(line))
                                {

                                }
                                else
                                {
                                    line = reader.readLine();
                                }
                            }
                            reader.close();
                        } catch (IOException ep)
                        {
                            ep.printStackTrace();
                        }

                        try
                        {
                            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                            writer.write(user);
                            writer.newLine();
                            writer.close();
                        }
                        catch(Exception o) {System.out.print("File not found");}
                    }
                });

                p.add(u);
                u.setBounds(70,120,560,100);
                p.add(co);
                co.setBounds(150,250,400,50);
                co.setVisible(true);
                repaint();
                revalidate();

            }
        });

        r = new JButton("Resume Game");
        r.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                resumeGame = true;
                repaint();
                b.setVisible(false);
                r.setVisible(false);
                q.setVisible(false);
            }
        });
        q = new JButton("Leaderboard");
        q.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                leaderboard = true;
                repaint();
                b.setVisible(false);
                r.setVisible(false);
                q.setVisible(false);
            }
        });

        p.add(b);
        b.setBounds(190,180,300,70);

        p.add(r);
        r.setBounds(190, 300, 300, 70);

        p.add(q);
        q.setBounds(190, 420, 300, 70);




        this.add (p);
        jf.setVisible(true);
        p.repaint();
        setResizable (false);
        setBounds (0,0,700,600);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }


    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

       if(newGame)
       {
           g2.setColor(blue);
           g2.fillRect(0,0,700,600);
           g2.setColor(Color.BLACK);
           g2.setFont(text);
           g2.drawString("Enter your username: ",50,100);
           if(user1)
           {
              bedroom.paint(g2);
           }

       }
       else if(resumeGame)
       {
           g2.setColor(blue);
           g2.fillRect(0,0,700,600);
       }
       else if(leaderboard)
       {
           g2.setColor(yellow);
           g2.fillRect(0,0,700,600);
       }
       else
       {
           //sky
           g2.setColor(blue);
           g2.fillRect(0,0,700,410);
           g2.setColor(yellow);
           g2.fillOval(-40,-20,120,120);
           //title
           g2.setColor(Color.WHITE);
           g2.setFont(f); // Set the font to f
           g2.drawString("Climate Change", 175, 120);
       }

    }

}
