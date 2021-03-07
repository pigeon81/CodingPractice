package Arrays;

import java.util.Scanner;

public class RemoveElement5
{
    private Scanner sc;
    private int ar[];
    private int m;

    public RemoveElement5(int n)
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

    public void removal()
    {
        System.out.println("Enter the value which you want to remove");
        int v = sc.nextInt();

        m = 0;
        for (int i = 0; i < ar.length; i++)
        {

            if (v == ar[i])
            {
                m = m + 1;
                for (int j = i; j < ar.length-1 ; j++)
                {
                    ar[j] = ar[j+1];
                }
            }

        }
    }
    public void display()
    {
        System.out.println("Your new desired array contains");
        for (int i = 0; i < ar.length-m; i++)
        {
            System.out.print(ar[i] + " ");

        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the size of the array");
        int n = sc.nextInt();
        RemoveElement5 s = new RemoveElement5(n);
        s.store();
        s.removal();
        s.display();
    }
}
/*  public void removal()
    {
        System.out.println("Enter the value which you want to remove");
        int v = sc.nextInt();

        int j = 0;
        for (int i = 0; i < ar.length; i++)
        {     j++;
            if (v == ar[i])
            {
                j--;
                ar[j] = ar[i];

            }
            }
 */