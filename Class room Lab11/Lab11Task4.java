import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

//import jdk.tools.jaotc.binformat.elf.JELFRelocObject;

class Lab11Task4 extends JFrame // Task 4
{

  public Lab11Task4()
  {
    setTitle("My Application");
    setSize(500,200);
    setLocation(10,200);

    final JLabel label=new JLabel("Calculator", SwingConstants.CENTER);
    label.setFont(label.getFont().deriveFont(28.0f));
    getContentPane().add(label, BorderLayout.PAGE_START);

    final JPanel buttoJPanel=new JPanel();
    getContentPane().add(buttoJPanel, BorderLayout.CENTER);

    setLayout(new FlowLayout());
    final JButton button1=new JButton("1");
    getContentPane().add(button1); 
    final JButton button2=new JButton("2");
    getContentPane().add(button2); 
    final JButton button3=new JButton("3");
    getContentPane().add(button3); 
    final JButton button4=new JButton("4");
    getContentPane().add(button4); 
    final JButton button5=new JButton("5");
    getContentPane().add(button5); 
    final JButton button6=new JButton("6");
    getContentPane().add(button6);  

     
  }
  
	 public static void main(String[] args) 
 	 {	
        	Lab11Task4 app = new Lab11Task4();
        	app.setVisible(true);
        	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  	}

}

