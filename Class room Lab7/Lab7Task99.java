class Lab7Task99{
    public static void main(String[] args){
      Donut p1 = new Donut("Choco",25);
      Donut p2 = new Donut("Strawbery",35);
      Donut p3 = new Donut("Creamy",15);
      Donut p4 = new Donut("Sugar",45);
      Donut p5 = new Donut("Mango",55);
  
      DonutBox box1 = new DonutBox();
      box1.putDonut(p1);
      box1.putDonut(p2);
      box1.putDonut(p3);
  
      DonutBox box2 = new DonutBox();
      box2.putDonut(p4);
      box2.putDonut(p5);
      
      System.out.println("Box1 Total Price = "+box1.getTotalPrice());
      System.out.println("Box2 Total Price = "+box2.getTotalPrice());
    }
  }