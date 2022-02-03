import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyApp extends JFrame
{

  public MyApp()
  {
    setTitle("My Application");
    setSize(500,200);
    setLocation(10,200);

    setLayout(new FlowLayout());
    final JLabel label = new JLabel("Hello Mor Nor");
    getContentPane().add(label, BorderLayout.BEFORE_FIRST_LINE);

    final JButton button = new JButton("Yes Flash");
    getContentPane().add(button);

    final JButton button2 = new JButton("No Flash");
    getContentPane().add(button2);


  }
  public static void main(String[] args) 
 	 {	
        	MyApp app = new MyApp();
        	app.setVisible(true);
        	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  	}


}

