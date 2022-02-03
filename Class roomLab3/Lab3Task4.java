public class Lab3Task4 {
    public static void main(String[] args) {
      String[] hello = {"Hello", "Jeremy"};
      System.out.println(last(hello)); // prints "Jeremy"
      String[] empty = {};
      System.out.println(last(empty)); // prints "null"
  }  
   public static String last(String a[] )
   {
       if(a.length>0){
           return a[a.length-1];
       }
       else
       {
           return  null;
       }
   }
  }
  