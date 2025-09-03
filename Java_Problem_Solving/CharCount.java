//package Java_Problem_Solving;
import java.util.*;
public class CharCount {
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      String str = s.next();
      char[] arr=str.toCharArray();

      String ans="";
      int c=1,i;

      for(i=1;i<arr.length;i++)
      {
        if(arr[i-1]==arr[i])
        {
          c++;
        }
        else
        {
          ans = ans+arr[i-1];
          ans=ans+c;
          c=1;
        }
      }
      ans=ans+arr[i-1];
      ans=ans+c;
      System.out.print(ans);
      s.close();
  }
}

