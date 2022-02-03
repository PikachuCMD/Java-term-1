
    import java.awt.EventQueue;
    04.
     
    05.
    import javax.swing.JButton;
    06.
    import javax.swing.JFrame;
    07.
     
    08.
    import java.awt.event.ActionListener;
    09.
    import java.awt.event.ActionEvent;
    10.
    import javax.swing.JTextField;
    11.
    import javax.swing.JLabel;
    12.
    import javax.swing.JTextArea;
    13.
    import javax.swing.JPasswordField;
    14.
     
    15.
     
    16.
    public class passwod  extends JFrame {
    17.
     
    18.
    /**
    19.
    * Launch the application.
    20.
    */
    21.
    public static void main(String[] args) {
    22.
    EventQueue.invokeLater(new Runnable() {
    23.
    public void run() {
    24.
    MyForm frame = new MyForm();
    25.
    frame.setVisible(true);
    26.
    }
    27.
    });
    28.
    }
    29.
     
    30.
    /**
    31.
    * Create the frame.
    32.
    */
    33.
    public MyForm() {
    34.
     
    35.
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    36.
    setBounds(100, 100, 362, 249);
    37.
    setTitle("ThaiCreate.Com Java GUI Tutorial");
    38.
    getContentPane().setLayout(null);
    39.
     
    40.
    // Password Field
    41.
    final JPasswordField password = new JPasswordField();
    42.
    password.setBounds(108, 26, 139, 20);
    43.
    getContentPane().add(password);
    44.
     
    45.
    // Label
    46.
    final JLabel lbl = new JLabel("Result");
    47.
    lbl.setBounds(103, 120, 144, 14);
    48.
    getContentPane().add(lbl);
    49.
     
    50.
    // Button
    51.
    JButton btn1 = new JButton("Button 1");
    52.
    btn1.addActionListener(new ActionListener() {
    53.
    public void actionPerformed(ActionEvent e) {
    54.
    String passText = new String(password.getPassword());
    55.
    lbl.setText("Password = "+ passText);  
    56.
    }
    57.
    });
    58.
    btn1.setBounds(128, 72, 99, 23);
    59.
    getContentPane().add(btn1);
    60.
     
    61.
    }
    62.
    }   
}
