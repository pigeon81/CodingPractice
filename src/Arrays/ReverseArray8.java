package Arrays;

import java.util.Scanner;

public class ReverseArray8
{
    private Scanner sc;
    private int ar[];

    public ReverseArray8(int n)
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

    public void reverse()
    {
        int m;
        for (int i = 0; i < ar.length/2; i++)
        {
            m = ar[i];
            ar[i] = ar[ar.length-1-i];
            ar[ar.length-1-i] = m;
        }
    }

    public void getReverse()
    {
        System.out.println(" Reverse order of the given array is");
        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        System.out.println(" Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ReverseArray8 s = new ReverseArray8(n);
        s.store();
        s.reverse();
        s.getReverse();
    }

}
