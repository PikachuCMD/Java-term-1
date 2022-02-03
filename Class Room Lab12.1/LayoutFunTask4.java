import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.border.Border;
class LayoutFunTask4 extends JFrame {

	public LayoutFunTask4() {

		setTitle("Layout Fun");
		setSize(400, 340);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Flow layout for a row of components
		setLayout(new BorderLayout());

        final JLabel label=new JLabel("Calcutor",SwingConstants.CENTER);
        label.setFont(label.getFont().deriveFont(28.0f));
        getContentPane().add(label,BorderLayout.PAGE_START);
        
        final JPanel panel=new JPanel();
        getContentPane().add(panel,BorderLayout.CENTER);

        panel.setLayout(new GridLayout(2,3));

		final JButton button1 = new JButton("1");
        panel.add(button1);

        final JButton button2 = new JButton("2");
        panel.add(button2);

        final JButton button3 = new JButton("3");
        panel.add(button3);

        final JButton button4 = new JButton("4");
        panel.add(button4);

        final JButton button5 = new JButton("5");
        panel.add(button5);
	}
	
	public static void main(String[] args) {
		LayoutFunTask4  app = new LayoutFunTask4();
		app.setVisible(true);
	}
}
