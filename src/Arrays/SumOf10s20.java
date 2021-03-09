package Arrays;

import java.util.Scanner;

public class SumOf10s20
{
    private Scanner sc;
    private int ar[];

    public SumOf10s20(int n)
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

    public boolean checkCondition()
    {
        int m = 0;
        for (int i = 0; i < ar.length; i++)
        {
            if(ar[i] == 10)
            {
                m++;
            }
        }
        if (m == 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        SumOf10s20 s = new SumOf10s20(n);
        s.store();
        System.out.println(s.checkCondition());
    }
}
