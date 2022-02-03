import javax.swing.JFrame;
public class Myapp2 extends JFrame{

    Myapp2() 
    {
        setTitle("My Apppication");;
        setLocation(300,250);;
        setSize(300,200);;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        Myapp2 myapp=new Myapp2();
        myapp.setVisible(true);
    }
}
