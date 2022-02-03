import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
public class Task002 extends JFrame implements ActionListener {
    JTextField textField; 
    JButton button;
    JLabel label;
    Task002()
    {
       setSize(250,100);
       setLocation(100,100);
       setTitle("card");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       setLayout(new BorderLayout());
       
       JPanel panel=new JPanel(new GridLayout(2,1));
       getContentPane().add(panel,BorderLayout.PAGE_START);

       textField=new JTextField();
       panel.add(textField);
       
       button =new JButton("Enter");
       button.addActionListener(this);
       panel.add(button);
       
       label =new JLabel("");
       getContentPane().add(label,BorderLayout.CENTER);


    }
    public void actionPerformed(ActionEvent e)
    {
        int x=Integer.parseInt(textField.getText());
        label.setText(""+textField.getText());
    }
    public static void main(String[] args) {
        
      Task002 app=new Task002();
      app.setVisible(true);
      
    }
}
