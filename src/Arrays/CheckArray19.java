package Arrays;

import java.util.Scanner;

public class CheckArray19
{
    private Scanner sc;
    private int ar[];

    public CheckArray19(int n)
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

    public void check()
    {
        int m = 0;
        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] == 0 || ar[i] == -1)
            {
                m++;
            }
        }
        if(m == 0)
        {
            System.out.println("There are no 0 or -1 in the given array");
        }
        if(m > 0)
        {
            System.out.println("The array contains 0 or -1");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CheckArray19 s = new CheckArray19(n);
        s.store();
        s.check();
    }
}
