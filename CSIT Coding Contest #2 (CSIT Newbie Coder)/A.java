import java.util.Scanner;
class A
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        
        int input = sc.nextInt();         
        int megabyte=0;
        int kilobyte=0;
        int Byte=0;
        int bit=0;     
        int remain = input ;   
        
        megabyte = input / 1048576; 
        remain = input % 1048576;  
        kilobyte = remain / 1024 ;  
        remain = remain % 1024 ;  
        Byte = remain / 8;  
        remain = remain % 8;  
        bit = remain;    
       
        System.out.println(megabyte+" Megabyte");
        System.out.println(kilobyte +" Kilobyte");
        System.out.println(Byte+" Byte" );
        System.out.println(bit+" Bit" );
     }
  
}
