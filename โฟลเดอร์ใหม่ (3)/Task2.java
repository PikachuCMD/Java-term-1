import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class FracSimple extends JFrame implements ActionListener {
  final JTextField topField, topField2;
  final JTextField bottomField, bottomField2;
  final JLabel equalsLabel1,equalsLabel2,equalsLabel3,equalsLabel4;

  public FracSimple()
   {
    setTitle("Fraction Calculator");
    setSize(280, 120);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
     //11
    final JPanel calcPanel = new JPanel(new FlowLayout());
    getContentPane().add(calcPanel, BorderLayout.PAGE_START);

    final JButton calcButton = new JButton("Calculate");
    getContentPane().add(calcButton, BorderLayout.PAGE_END);
    calcButton.addActionListener(this);
     //22
    final JPanel calcPane2 = new JPanel(new GridLayout(2,1,0,5));
    calcPanel.add(calcPane2);
     
    topField =new JTextField("1",2);
    calcPane2.add(topField);

    topField2=new JTextField("2",2);
    calcPane2.add(topField2);

    equalsLabel1=new JLabel(" + ");
    calcPanel.add(equalsLabel1);

    final JPanel calcPane3=new JPanel(new GridLayout(2,1,0,5));
    calcPanel.add(calcPane3);

    bottomField =new JTextField("3",2);
    calcPane3.add(bottomField);

    bottomField2=new JTextField("4",2);
    calcPane3.add(bottomField2);

    equalsLabel2=new JLabel(" = ");
    calcPanel.add(equalsLabel2);

    final JPanel calcPane4=new JPanel(new GridLayout(2,1));
    calcPanel.add(calcPane4);

    equalsLabel3=new JLabel("0");
    calcPane4.add(equalsLabel3);
   
    equalsLabel4=new JLabel("0");
    calcPane4.add(equalsLabel4);

  }

  public void actionPerformed(ActionEvent e) 
  {
        int a=Integer.parseInt(topField.getText());
        int b=Integer.parseInt(topField2.getText());
        int c=Integer.parseInt(bottomField.getText());
        int d=Integer.parseInt(bottomField2.getText());

        int equalsLabel33=(a+d)+(b+c);
        int equalsLabel44=c*d;

        equalsLabel3.setText(""+equalsLabel33);
        equalsLabel4.setText(""+equalsLabel44);
  }
  public static void main(String[] args) {
    FracSimple app = new FracSimple();
    app.setVisible(true);
  }
}