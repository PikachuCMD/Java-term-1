class Lab7Task1 {
       public static void main(String[] args) {
           Product1 tea1 =new Product1("Thai Iced Tae",35.0);
           Product1 tea2 =new Product1("English Breakfast Tae",45.0);

           System.out.println("tea1 : "+tea1.getName()+", "+tea1.getPrice());
           System.out.println("tea2 : "+tea2.toString());

           Product1 teaX = new Product1("Thai Iced Tae",35.0);
              if(tea1.equals(teaX))
              {
                  System.out.println("Tea1 and TeaX are the same");
              }

       }
}
