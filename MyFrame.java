import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.font.*;
import java.util.Scanner;

/*public class MyFrame extends Frame
{
    Font title = new Font("Serif",Font.PLAIN,32);
    Font text = new Font("SansSerif",Font.PLAIN,20);
    Font f = new Font("Serif", Font. PLAIN, 52);
    char user;
    Scanner s;
    public MyFrame()
    {
        setVisible(true);
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
    }
    public void paint(Graphics g)
    {

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.WHITE);
        g2.setFont(f); // Set the font to f
        g2.drawString("Climate Change", 175, 100);

        // Now set the font to text for subsequent text
        g2.setFont(text);
        g2.drawRoundRect(190, 180, 300, 70, 30, 30);
        g2.drawString("Start New Game", 265, 205);
        g2.drawString("Press 'g'", 295, 235);
        g2.drawRoundRect(190, 300, 300, 70, 30, 30);
        g2.drawString("Resume Game", 270, 325);
        g2.drawString("Press 'r'", 290, 355);
        g2.drawRoundRect(190, 420, 300, 70, 30, 30);
        g2.drawString("Leaderboard", 270, 445);
        g2.drawString("Press 'l'", 290, 475);
        mainMenu();
    }

    public void mainMenu()
    {
        user =s.next().charAt(0);
        if(user=='g')
        {
            //paint1();
        }
        else if (user == 'r')
        {

        }
        else if(user == 'l')
        {

        }
    }


    public static void main(String[] args)
    {
        MyFrame m = new MyFrame();
        m.mainMenu();

    }
}*/