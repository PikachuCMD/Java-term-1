import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
public class Task4 extends JFrame implements ActionListener{
    JButton button;
    JLabel label;
    JButton button2;
    JTextField textField;
   public Task4()
    {
        setTitle("card");
        setLocation(200, 300);
        setSize(250,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        textField=new JTextField("?");
        getContentPane().add(textField,BorderLayout.PAGE_START);

        JPanel panel=new JPanel(new GridLayout(2,2,10,10));
        
        getContentPane().add(panel,BorderLayout.CENTER);

        button=new JButton("LowerCase");
        panel.add(button);
        button.addActionListener(this);
        button.setActionCommand("+");

        button2=new JButton("UpperCase");
        panel.add(button2);
        button2.addActionListener(this);
        button2.setActionCommand("-");

        label =new JLabel("");
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label);

    }
    public void actionPerformed(ActionEvent e)
    {
        JButton app=(JButton)  e.getSource();

        if(app.getActionCommand().equals("+"))
        {
            label.setText(textField.getText().toLowerCase());
        }
        else
        {
            label.setText(textField.getText().toUpperCase());
        }
    }
    public static void main(String[] args) {
        Task4 app=new Task4();
       app.setVisible(true);
       String y="card";
         String x=y.toLowerCase();
         String z=y.toUpperCase();
    }
}
