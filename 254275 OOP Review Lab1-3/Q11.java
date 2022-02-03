import java.util.*; 
class Q11
{ 
static void countFreq(int arr[], int n) 
  { 
      String x="";
      Map<Integer, Integer> mp = new HashMap<>(); 
      for (int i = 0; i < n; i++) 
      { 
          if (mp.containsKey(arr[i]))  
          { 
              mp.put(arr[i], mp.get(arr[i]) + 1); 
          }  
          else
          { 
              mp.put(arr[i], 1); 
          } 
      } 
      for (Map.Entry<Integer, Integer> entry : mp.entrySet()) 
      {       
           x+= "{"+entry.getKey() +":"  + entry.getValue()+"}";
               if(entry.getKey()<mp.keySet().size())
               {
                   x+= ",";
               }             
      } 
      System.out.print(x);
 }
public static void main(String args[])  
  { 
      String x[] = new Scanner(System.in).nextLine().split(" ");
      int arr[] = new int[x.length];
      for(int i=0;i<x.length;i++)
      {
          arr[i]=Integer.parseInt(x[i]);
      }
      int n = arr.length; 
      countFreq(arr, n); 
  } 
} 
