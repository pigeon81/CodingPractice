package Arrays;

import java.util.Scanner;

public class Find2ndSmallest13
{
    private Scanner sc;
    private int ar[];

    public Find2ndSmallest13(int n)
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

    public void finding()
    {
        int min = Integer.MAX_VALUE;
        int min2 = 0;
        for (int i = 0; i < ar.length; i++)
        {
                if(ar[i] <= min)
                {
                    min2 = min;
                    min = ar[i];
                }
                if(ar[i] < min2 && ar[i] > min)
                {
                    min2 = ar[i];
                }
        }
        System.out.println("second smallest number is " +min2);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Find2ndSmallest13 s = new Find2ndSmallest13(n);
        s.store();
        s.finding();
    }


}
