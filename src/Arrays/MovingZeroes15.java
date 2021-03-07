package Arrays;

import java.util.Scanner;

public class MovingZeroes15
{
    private int ar[];
    private Scanner sc;

    public MovingZeroes15(int n)
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

    public void moveZero()
    {
        for (int i = 0; i < ar.length; i++)
        {
            if(ar[i] == 0)
            {
                for (int j = i; j < ar.length-1; j++)
                {
                    ar[j] = ar[j+1];
                }
                ar[ar.length-1] = 0;
            }
        }
        for (int i = 0; i < ar.length; i++)
        {
            if(ar[i] == 0)
            {
                for (int j = i; j < ar.length-1; j++)
                {
                    ar[j] = ar[j+1];
                }
                ar[ar.length-1] = 0;
            }
        }
    }

    public void getNewArray()
    {
        System.out.println("The new modified array is");
        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        MovingZeroes15 s = new MovingZeroes15(n);
        s.store();
        s.moveZero();
        s.getNewArray();

    }
}
