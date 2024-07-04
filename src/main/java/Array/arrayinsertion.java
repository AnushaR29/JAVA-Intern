package Array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayinsertion
{
    public static void main(String[] args)
    {
      int[] arr=new int[7];
      arr[2]=54;
      arr[3]=56;
      arr[5]=99;
      System.out.println(Arrays.toString(arr));
      Scanner scan=new Scanner(System.in);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter your number : ");
            arr[i]=scan.nextInt();
        }
        for (int anu:arr)
        {
            System.out.println(anu);
        }
    }

}
