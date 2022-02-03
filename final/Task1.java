import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.JPanel;
import javax.swing.JTextField;
class Task1 extends JFrame implements ActionListener
{
  final JLabel resultJLabel;
   JTextField topField;
   int x=0;
  public Task1()
  {
     
     
    setLayout(new BorderLayout());
    
    final JPanel calcPanel=new JPanel(new BorderLayout());
    getContentPane().add(calcPanel ,BorderLayout.PAGE_START);
    
   
    topField=new JTextField("");
    calcPanel.add(topField);


    final JButton punchButton=new JButton("Enter");
    punchButton.setActionCommand("puch");
    punchButton.addActionListener(this);
    getContentPane().add(punchButton ,BorderLayout.WEST);
     

    resultJLabel =new JLabel("");
   resultJLabel.setHorizontalAlignment(JLabel.CENTER);
     getContentPane().add(resultJLabel);
      


  }
     
    public void actionPerformed(ActionEvent e)
  {
      JButton button=(JButton) e.getSource();
      String x=topField.getText();
       if(button.getActionCommand().equals("puch"))
       {
           resultJLabel.setText(x.length()+" : word");
       }
     
  }
  public static void main(String[] args) 
 	 {	
        	Task1 app = new Task1();
        	app.setVisible(true);
        	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            app.setTitle("My Application");
            app.setSize(250,100);
            app.setLocation(10,200);
  	}


}