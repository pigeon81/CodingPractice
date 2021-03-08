//to find the smallest and the 2nd smallest number
package Arrays;

import java.util.Scanner;

public class FindSmall2ndSmall24
{
    private Scanner sc;
    private int ar[];

    public FindSmall2ndSmall24(int n)
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

    public void searchSmall()
    {
        int min = Integer.MAX_VALUE;
        int min2 = 0;

        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] <= min)
            {
                min2 = min;
                min = ar[i];
            }
        }
        System.out.println("smallest number is " +min + "  2nd smallest number is " +min2);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        FindSmall2ndSmall24 s = new FindSmall2ndSmall24(n);
        s.store();
        s.searchSmall();
    }
}
