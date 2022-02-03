import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Myapp7 extends JFrame implements ActionListener
{
  final JLabel resultJLabel;

  public Myapp7()
  {
     
    setLayout(new FlowLayout());
    final JLabel label = new JLabel("Hello Mor Nor");
    getContentPane().add(label, BorderLayout.BEFORE_FIRST_LINE);

    final JButton button1 = new JButton("Yes Flash");
    getContentPane().add(button1);
    button1.addActionListener(this);

    final JButton button2 = new JButton("No Flash");
    getContentPane().add(button2);
    button2.addActionListener(this);
    
    final JButton punchButton=new JButton("Puch");
    punchButton.setActionCommand("puch");
    punchButton.addActionListener(this);
    getContentPane().add(punchButton);
     

    resultJLabel =new JLabel("");
     getContentPane().add(resultJLabel);
      


  }
    public void actionPerformed(ActionEvent e)
  {
      JButton button=(JButton) e.getSource();
      if(button.getActionCommand().equals("puch"))
      {
          resultJLabel.setText("Pregnen");
      }
      else
      {
          resultJLabel.setText("what do you call a three humped camel?");
      }
  }
  public static void main(String[] args) 
 	 {	
        	Myapp7 app = new Myapp7();
        	app.setVisible(true);
        	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            app.setTitle("My Application");
            app.setSize(500,200);
            app.setLocation(10,200);
  	}


}

