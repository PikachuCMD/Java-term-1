
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class Task2  extends JFrame implements ActionListener
 {

    int x=1;
    public Task2()
    {
       setTitle("window");
       setSize(400,400);
       setLocation(250,250);
       setDefaultCloseOperation(EXIT_ON_CLOSE);

       JButton button = new JButton("NO");
       getContentPane().add(button);
       button.addActionListener(this);
       button.setActionCommand("");


    }
    public void isSelected()
    {

    }
   public void actionPerformed(ActionEvent e)
   {
           
           JButton d= (JButton) e.getSource();
          if(d.getActionCommand().equals("on"))
           {
                d.setText("on");
           }
           else
           {
               d.setText("off");
           }
   }
    public static void main(String[] args) {
       
        Task2 app=new Task2();
        app.setVisible(true);
    }
}
