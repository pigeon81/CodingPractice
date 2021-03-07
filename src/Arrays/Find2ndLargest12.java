package Arrays;

import java.util.Scanner;

public class Find2ndLargest12
{
    private Scanner sc;
    private int ar[];

    public Find2ndLargest12(int n)
    {
        sc = new Scanner(System.in);
        ar = new int[n];
    }

    public void store()
    {
        System.out.println("Enter the values of the array");
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
    }

    public void finding()
    {
        int max = Integer.MIN_VALUE;
        int max2 = 0;
        for (int i = 0; i < ar.length; i++)
        {
                if(ar[i] >= max)
                {
                    max2 = max;
                    max = ar[i];
                }
                if(ar[i] > max2 && ar[i] < max)
                {
                    max2 = ar[i];
                }
        }
        System.out.println(" Second largest number is " +max2 );
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array" );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Find2ndLargest12 s = new Find2ndLargest12(n);
        s.store();
        s.finding();
    }
}
