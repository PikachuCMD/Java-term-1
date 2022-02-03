class Tast{
	public static void main(String[] args){
		Product p = new Product("Phone",25000);
		System.out.println("Product: "+p.getName());
		System.out.println("Price: "+p.getPrice());
		System.out.println(p.toString());
	}
}