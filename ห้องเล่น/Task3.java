class Test3
{
  public static void main(String[] args)
  {
    int a[][] = {{10,15,20,22},{12,8,10,19},{15,11,9,18},{17,16,14,17}};
    System.out.print(a[0][0]+" ");
    System.out.print((a[0][1]+a[1][0])+" ");
    System.out.print(a[2][0]+a[1][1]+a[0][2]+" ");
    System.out.print(a[3][0]+a[2][1]+a[1][2]+a[0][3]+" ");
    System.out.print(a[3][1]+a[2][2]+a[1][3]+" ");
    System.out.print(a[3][2]+a[2][3]+" ");
    System.out.print(a[3][3]);


  }
}