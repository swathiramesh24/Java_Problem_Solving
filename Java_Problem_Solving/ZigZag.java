//package Java_Problem_Solving;
import java.util.*;

public class ZigZag {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] arr = new int[r][c];
        int sum=0;
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0||i==r-1)
                {
                    sum += arr[i][j];
                }
            }
        }
        
        for(int i=1;i<r-1;i++)
        {
            sum += arr[i][c-i-1];
        }
        
        System.out.print(sum);
    }
}
