import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Task2 extends JFrame implements ActionListenner
{    
   final Component textf;
     JButton a1,a2,a3,a4,a5,a6,a7,a8,a9,a0,b1,b2,b3,b4;
    Task2()
    {
        setLayout(new BorderLayout());

        JPanel panel=new JPanel(new FlowLayout());
        getContentPane().add(panel,BorderLayout.PAGE_START);

        textf= new JTextField("2",2);
        panel.add(textf);
        

    }
     public static void main(String[] args) {
         Task2 app=new Task2();
         app.setTitle("card");
         app.setSize(250,100);
         app.setLocation(250, 100);
         app.setVisible(true);
         app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }    
}
