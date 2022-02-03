    import javax.swing.JFrame;
    import javax.swing.JButton;
    import java.awt.GridLayout;
    public class Test extends JFrame
    {
        public Test()
        {
            setTitle("Hello Mini Test 3");
            setLayout(new GridLayout(4,4));
            setButton();
            setSize(500,200);
            setLocation(550,250);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    
        protected  void setButton()
        {
            for(int i=1;i<=16;i++)
            {
                add(new JButton(""+i));
            }
        }
    
        public static void main(String[] args)
        {
           Test fr = new Test();
        }
    } 

