package Arrays;

import java.util.Scanner;

public class EvenOdd16
{
    private Scanner sc;
    private int ar[];

    public EvenOdd16(int n)
    {
        sc = new Scanner(System.in);
        ar = new int[n];
    }

    public void store()
    {
        System.out.println("Enter the values for te array");
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
    }

    public void countEvenOdd()
    {
        int m = 0;
        int n = 0;
        for (int i = 0; i < ar.length; i++)
        {
            if(ar[i] % 2 == 0)
            {
                m++;
            }
            else
            {
                n++;
            }
        }
        System.out.println("count of even numbers " + m);
        System.out.println("count of odd numbers " + n);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        EvenOdd16 s = new EvenOdd16(n);
        s.store();
        s.countEvenOdd();
    }
}
