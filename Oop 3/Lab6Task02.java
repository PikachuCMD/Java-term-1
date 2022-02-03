class Lab6Task02{
	public static void main(String args[]){
		Thinker.showTitle();
		Thinker p1 = new Thinker(20);
		System.out.println("I am "+p1.getAge()+" years old.");	
		
		Thinker p2 = new Thinker(25);
		System.out.println("I am "+p2.getAge()+" years old.");
		
		System.out.println("Amount of Thinker = "+Thinker.getAmount());
	}
}