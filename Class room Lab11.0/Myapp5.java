import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Myapp5 extends JFrame implements ActionListener
{

  public Myapp5()
  {
    setLayout(new FlowLayout());
    final JLabel label = new JLabel("Hello Mor Nor");
    getContentPane().add(label, BorderLayout.BEFORE_FIRST_LINE);

    final JButton button1 = new JButton("Yes Flash");
    getContentPane().add(button1);
    button1.addActionListener(this);

    final JButton button2 = new JButton("No Flash");
    getContentPane().add(button2);


  }
    public void actionPerformed(ActionEvent e)
  {
      System.out.println("what do you call a three humped camel?");
  }
  public static void main(String[] args) 
 	 {	
        	Myapp5 app = new Myapp5();
        	app.setVisible(true);
        	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            app.setTitle("My Application");
            app.setSize(500,200);
            app.setLocation(10,200);
  	}


}

