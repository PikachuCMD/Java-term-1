import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.*;

class Task extends JFrame implements ActionListenner
{
      int x=0;
	public Task() {

		setTitle("Layout Fun");
		setSize(400, 340);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Flow layout for a row of components
		setLayout(new BorderLayout());

         JButton button=new JButton("2x");
         getContentPane().add(button);
         button.setActionCommand("x");
         button.addActionListener((ActionListener) this);
         
         JLabel label =new JLabel("");
         getContentPane().add(label);
		
	}
   public void addActionpfomed(ActionEvent e) 
    {
       JButton bb=(JButton) e.getSource();
    }
	
	public static void main(String[] args) {
		Task  app = new Task();
		app.setVisible(true);
	}
}