//maximum product of a triplet(subsequence of size 3) in an array
package Arrays;

import java.util.Scanner;

public class SubSequence
{
    Scanner sc;
    int ar[];
    int n1;

    public SubSequence(int n)
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

    public void findSubSequence()
    {
        int min = Integer.MIN_VALUE;
        int prod = 0;
        int m = 0;
        for (int i = 0; i < ar.length-2; i++)
        {
            for (int j = i+1; j < ar.length-1; j++)
            {
                for (int k = j+1; k < ar.length; k++)
                {
                    if (ar[i] < ar[j] && ar[j] < ar[k])
                    {
                        m++;
                        prod = ar[i] * ar[j] * ar[k];
                        if (prod > min)
                        {
                            min = prod;
                        }
                    }
                }
            }
        }
        if (m > 0)
        {
            System.out.println("Maximum product of the triplet is " +min);
        }
        else
        {
            System.out.println("No proper increasing triplet present ");
        }
    }

    public int input(int n)
    {
        if (n < 3 )
        {
            System.out.println("Enter a valid number greater than 3");
            n1 = sc.nextInt();
            input(n1);
        }
        n1 = n;
        return n1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        SubSequence s = new SubSequence(n);
        int n1 = s.input(n);
        SubSequence s2 = new SubSequence(n1);
        s2.store();
        s2.findSubSequence();

    }
}
