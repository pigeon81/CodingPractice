//arrange all even numbers first and then odd numbers
package Arrays;

import java.util.Scanner;

public class ArrangeEvenOdd26
{
    private Scanner sc;
    private int ar[];
    private int ar1[];

    public ArrangeEvenOdd26(int n)
    {
        sc = new Scanner(System.in);

        //use names as ar1 and ar2
        ar = new int[n];
        ar1 = new int[n];
    }

    public void store()
    {
        System.out.println(" Enter the values for the array");
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
    }

    public void segregate()
    {

        //there is a better logic. try to solve it without using extra array.
        int m = 0;
        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] % 2 == 0)
            {
                m++;
                ar1[m-1] = ar[i];

            }
        }
        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] % 2 != 0)
            {
                m++;
                ar1[m-1] = ar[i];

            }
        }
    }

    public void display()
    {
        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(ar1[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrangeEvenOdd26 s = new ArrangeEvenOdd26(n);
        s.store();
        s.segregate();
        s.display();
    }
}
