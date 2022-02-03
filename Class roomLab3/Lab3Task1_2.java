class Lab3Task1_2
{
    public static void main(String[] args) {
        String[] friends = { "Joe", "Ray", "Sam", "Paul" };
        int[] ages = { 20, 21, 19, 21 };
        int x=ages[0];
        String y=friends[0];
        for(int i=0;i<friends.length;i++)
         {
            if(x>ages[i])
            {
            x=ages[i];
            y=friends[i];
            }
         }
        System.out.print(y+" is the youngest.");
    }
}