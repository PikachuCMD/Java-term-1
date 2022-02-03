import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.Random;

class Game extends JFrame 
{

	final JLabel questionLabel;
    final JButton a=new JButton();
    final JButton b=new JButton();


	public Game() 
    {

		setTitle("Countries and Cities Game");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		questionLabel = new JLabel();
        getContentPane().add(questionLabel);

        
        
        getContentPane().add(a);
        getContentPane().add(b);

        a.addActionListeners(this);
        b.addActionListeners(this);

       
         nextQuestion();
	}


    private void nextQuestion()
    {
    	Question question = Question.randomQuestion();
    	questionLabel.setText(question.getText());


    }

    public static void main(String[] args) 
    {
		Game app = new Game();
		app.setVisible(true);
	}
}