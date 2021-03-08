//To segregate all the zeroes on the left and all the ones on the right of an of zeroes and ones.
package Arrays;

import java.util.Scanner;

public class ZeroesOnes25
{
    private Scanner sc;
    private int ar[];

    public ZeroesOnes25(int n)
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

    public void segregation()
    {
        int m = 0;
        for (int i = 0; i < ar.length; i++)
        {
                if(ar[i] == 0)
                {
                    m++;
                }
        }
        for (int i = 0; i < m; i++)
        {
            ar[i] = 0;
        }
        for (int i = m; i < ar.length; i++)
        {
            ar[i] = 1;
        }
    }

    public void display()
    {
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

        ZeroesOnes25 s = new ZeroesOnes25(n);
        s.store();
        s.segregation();
        s.display();
    }
}
