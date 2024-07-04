package Array;

import java.util.Arrays;

public class arraycreation
{
    public static void main(String[] args)
    {
        int a1[] = {1,2,3,4,5};
        int a2[] = new int[15];
        System.out.println(a1.length);
        for(int i=0;i<a1.length;i++)
        {
            System.out.println(a1[i]);
        }
        for(int hai:a1)
        {
            System.out.println(hai);
        }
        System.out.println(Arrays.toString(a1));
    }
}
