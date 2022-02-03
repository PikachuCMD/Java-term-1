class Q18{
      public static void main(String[] args) {
        Vehicle bus = new Vehicle(49, 105.0);
        Vehicle dd = bus.doubleDecker();
        System.out.println("Seats: "+dd.getSeats()); // Prints "Seats: 98"
        
      }
}