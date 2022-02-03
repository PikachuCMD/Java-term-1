import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JButton;

import java.awt.BorderLayout;

public class LayoutFunTask5 extends JFrame{

    final JTextField topField;
    final JTextField bottomField;
    final JLabel equLabel;

   public LayoutFunTask5()
    {
        setTitle("windoe");
        setLocation(200,300);
        setSize(280,100);
        
        setLayout(new BorderLayout());

        final JPanel calcPanel=new JPanel(new FlowLayout());
        getContentPane().add(calcPanel,BorderLayout.CENTER);

        final JButton calcButton=new JButton("Convert");
        getContentPane().add(calcButton,BorderLayout.PAGE_END);

        topField=new JTextField("1",2);
        calcPanel.add(topField);

        final JLabel pluslabel=new JLabel("+");
        pluslabel.setFont(pluslabel.getFont().deriveFont(20.0f));
        calcPanel.add(pluslabel);

        bottomField=new JTextField("3",2);
        calcPanel.add(bottomField);

        equLabel=new JLabel("= ?");
        equLabel.setFont(equLabel.getFont().deriveFont(20.0f));
        calcPanel.add(equLabel);



    }
    

    public static void main(String[] args) {
        LayoutFunTask5 app=new LayoutFunTask5();
           app.setVisible(true);
           app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}
