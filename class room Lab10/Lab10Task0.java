import java.util.Scanner;
class Lab10Task0
{
    public static void main(String[] args) {
        
        String x=new Scanner(System.in).nextLine(); 
        Student stu;
        stu=new Student(x);
        stu= new Graduate();
        stu.calGrade();
        System.out.println();
        stu=new Undergrad();
        stu.calGrade();
        System.out.println();
    }
  
    
}