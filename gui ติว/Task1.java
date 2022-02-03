import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

class Task1 extends JFrame implements ActionListener
{

  public Task1()
  {
    setTitle("My Application");
    setSize(500,200);
    setLocation(10,200);

   // setLayout(new FlowLayout());
    //final JLabel label = new JLabel("Hello Mor Nor");
    //getContentPane().add(label, BorderLayout.CENTER);

    final JButton button = new JButton("Yes Flash");
    getContentPane().add(button);
    button.addActionListener(this);

    final JButton button2 = new JButton("No Flash");
    getContentPane().add(button2);
    setLayout(new FlowLayout());
    
    
    public void actionPerformed(ActionEvent e)
  {
     System.out.println("What do you call?");
  }

  }
  public static void main(String[] args) 
 	 {	
        	Task1 app = new Task1();
        	app.setVisible(true);
        	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  	}


}
