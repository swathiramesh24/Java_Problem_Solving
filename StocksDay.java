package Java_Problem_Solving;
import java.util.*;
public class StocksDay {
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int[] arr = new int[n];

      for(int i=0;i<n;i++)
      {
        arr[i]=s.nextInt();
      }

      int buy=0;
      int sell=0;
      int profit=0;

      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          if(arr[j]-arr[i]>profit)
          {
            profit=arr[j]-arr[i];
            buy=i;
            sell=j;
          }
        }
      }
      System.out.print("Buy on day " + buy + " and sell on day " + sell + " so the profit will be " + profit);
  }
}
