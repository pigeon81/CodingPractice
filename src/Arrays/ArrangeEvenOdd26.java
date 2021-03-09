//arrange all even numbers first and then odd numbers
package Arrays;

import java.util.Scanner;

public class ArrangeEvenOdd26
{
    private Scanner sc;
    private int ar[];

    public ArrangeEvenOdd26(int n)
    {
        sc = new Scanner(System.in);

        //use names as ar1 and ar2
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

    public void segregate()
    {
        int m, j = ar.length - 1;
        for (int i = 0; i != j; i++)
        {
            if( ar[i] % 2 != 0)
            {
                m = ar[i];
                ar[i] = ar[j];
                ar[j] = m;
                j--;
                i--;
            }
        }

    }

    public void display()
    {
        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(ar[i] + "\t");
        }
    }


//    2 12 6 8 1 7 45 3
    // 2 3 7 1 12 6 8 45

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
