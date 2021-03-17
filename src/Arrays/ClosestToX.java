//find the pair in a sorted  array which is closest to the value X
package Arrays;

import java.util.Scanner;

public class ClosestToX
{
    Scanner sc;
    int ar[];

    public ClosestToX(int n)
    {
        sc = new Scanner(System.in);
        ar = new int[n];
    }

    public void store()
    {
        System.out.println("Enter the value of the array");
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
    }

    public void toFind(int x)
    {
        int close = Integer.MAX_VALUE;
        int m,n,pair1 = 0,pair2 = 0;
        for (int i = 0; i < ar.length-1; i++)
        {
            for (int j = i+1; j < ar.length; j++)
            {
                m = ar[i] + ar[j];
                n = x - m;
                if (n < 0)
                {
                    n = -n;
                }
                if (n <= close)
                {
                    close = n;
                    pair1 = ar[i];
                    pair2 = ar[j];
                }
            }
        }
        System.out.println("The closest pair in the array is " + pair1 +","+ pair2);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the value of X");
        int x = sc.nextInt();

        ClosestToX s = new ClosestToX(n);
        s.store();
        s.toFind(x);

    }


}
