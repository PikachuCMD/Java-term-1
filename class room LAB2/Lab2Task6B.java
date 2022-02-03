class Lab2Task6B{
	public static void main(String args[]){
	        String z  = lastcharacter("programing");
		System.out.println(z);
    }
    public static String lastcharacter(String x)
    {
        String z="";
        char y=x.charAt(x.length()-1);
        z+=y;
          return z;
    }
}