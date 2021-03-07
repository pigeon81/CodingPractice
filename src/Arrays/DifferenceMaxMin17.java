package Arrays;

import java.util.Scanner;

public class DifferenceMaxMin17
{
    private Scanner sc;
    private int ar[];

    public DifferenceMaxMin17(int n)
    {
        sc = new Scanner(System.in);
        ar = new int[n];
    }

    public void store()
    {
        System.out.println("Enter the values for the array");
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
    }

    public void calculatingDifference()
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
        System.out.println("The difference is " + (max - min));
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1)
        {
            DifferenceMaxMin17 s = new DifferenceMaxMin17(n);
            s.store();
            s.calculatingDifference();
        }
        else
        {
            System.out.println("Enter a valid size");
        }
    }
}
