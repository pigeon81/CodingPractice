package Arrays;

import java.util.Scanner;

public class Average18
{
    private Scanner sc;
    private int ar[];

    public Average18(int n)
    {
        sc = new Scanner(System.in);
        ar = new int[n];
    }

    public void store()
    {
        System.out.println(" Enter the values for the array");
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
    }

    public void getAverage()
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++)
        {
            if( ar[i] >= max)
            {
                max = ar[i];
            }

            if(min >= ar[i])
            {
                min = ar[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < ar.length; i++)
        {
            sum = ar[i] + sum;
        }
        System.out.println("The average value is " +((sum-max-min)/(ar.length-3)));
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextByte();

        Average18 s = new Average18(n);
        s.store();
        s.getAverage();
    }
}
