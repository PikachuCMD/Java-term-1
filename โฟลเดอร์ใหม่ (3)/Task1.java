import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class Task1 extends JFrame implements ActionListener
{    
   private JLabel label;
     
   public Task1()
    {

      setLayout(new FlowLayout());

      final JButton button=new JButton("Random");
      getContentPane().add(button);
      button.addActionListener(this);

      label=new JLabel("-");
      label.setHorizontalAlignment(JLabel.CENTER);
      getContentPane().add(label);
         
    }
    
    public void actionPerformed(ActionEvent e)
    {
       int []x={1,2,3,4,5,6,7};
       Random random=new Random();
       for(int i=0;i<=x.length;i++)
       {
          int num=random.nextInt(x[i]);
        if(num>0)label.setText(" "+num);
       }
       
    }
   
    public static void main(String[] args) {
       Task1 app =new Task1();
       app.setVisible(true);    
       app.setSize(250,100);
       app.setLocation(100, 100);
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
}
