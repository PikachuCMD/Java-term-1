import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import java.awt.BorderLayout;


public class Task4 extends JFrame 
{

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
        {
			public void run() 
            {
				Task4 frame = new Task4();
				frame.setVisible(true);
			}
		}
        );
	}

	/**
	 * Create the frame.
	 */
	public Task4() 
	{

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 249);
		setTitle("Swich");
		setLayout(new BorderLayout());
		final JToggleButton tgBtn = new JToggleButton("ON");
        
		tgBtn.addActionListener(new ActionListener() 
        {
			public void actionPerformed(ActionEvent e) 
			{
				if (tgBtn.isSelected()) 
				{
					tgBtn.setText("OFF");
				} 
				else 
				{
					tgBtn.setText("ON");
					
				}
			}
		});

		tgBtn.setBounds(110, 77, 121, 23);
		getContentPane().add(tgBtn);

	}
}