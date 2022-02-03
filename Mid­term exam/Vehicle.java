public class Vehicle 
{
      private int seats;
      private double topSpeed;

      public Vehicle(int seats,double topSpeed)
      {
          this.seats=seats;
          this.topSpeed=topSpeed;
      }
      int getSeats()
      {
          return seats;
      } 
       boolean isQuickerThan(Vehicle car)
       {
           if(topSpeed<car.topSpeed)
           {
               return true;
           }
           else
           {
             return false;
           }
       }
       public Vehicle doubleDecker()
        {
         int a = (int) (getSeats() * 2);
         Vehicle hello = new Vehicle(a,topSpeed);
         return hello;
        }
}


