import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

class Task extends JFrame implements ActionListener
{
  final JLabel resultJLabel;
   int x=1;
  public Task()
  {
     
    setLayout(new BorderLayout());
    
    
    final JButton punchButton=new JButton("2X");
    punchButton.setActionCommand("puch");
    punchButton.addActionListener(this);
    getContentPane().add(punchButton ,BorderLayout.LINE_START);
     

    resultJLabel =new JLabel("1");
   resultJLabel.setHorizontalAlignment(JLabel.CENTER);
     getContentPane().add(resultJLabel);
      


  }
    public void actionPerformed(ActionEvent e)
  {
      JButton button=(JButton) e.getSource();
      if(button.getActionCommand().equals("puch"))
      {
             
         resultJLabel.setText(""+(x*2));
           x++;  
      }
     
  }
  public static void main(String[] args) 
 	 {	
        	Task app = new Task();
        	app.setVisible(true);
        	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            app.setTitle("My Application");
            app.setSize(240,100);
            app.setLocation(10,200);
  	}


}

