import javax.swing.JFrame;

class Lab11Task1
{
  public static void main(String[] args) 
  {
    JFrame frame = new JFrame();
    {
      frame.setTitle("My Application");
      frame.setSize(300,200);
      frame.setLocation(10, 200);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  }
}