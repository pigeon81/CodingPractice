package Arrays;

import java.util.Scanner;

public class MaxMin7
{
    private Scanner sc;
    private int ar[];

    public MaxMin7(int n)
    {
        sc = new Scanner(System.in);
        ar = new int[n];
    }

    public void store()
    {
        System.out.println(" Enter the values for the array ");
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
    }

    public void findMaxMin()
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++)
        {
               if( ar[i] > max)
               {
                   max = ar[i];
               }

               if(min > ar[i])
               {
                   min = ar[i];
               }
        }
        System.out.println("The maximum number is " +max);
        System.out.println("The minimum number is " +min);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        MaxMin7 s = new MaxMin7(n);
        s.store();
        s.findMaxMin();
    }
}
