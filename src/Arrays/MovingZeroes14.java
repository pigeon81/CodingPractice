package Arrays;

import java.util.Scanner;

public class MovingZeroes14
{
    private int ar[];
    private Scanner sc;

    public MovingZeroes14(int n)
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
                for (int j = i; j < ar.length-i; j++)
                {
                    ar[j] = ar[j+1];
                }
            }
        }
    }
}
