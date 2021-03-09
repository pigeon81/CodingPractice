package Arrays;

import java.util.Scanner;

public class RemoveDuplicate11
{
    private Scanner sc;
    private int ar[];
    private int m;

    public RemoveDuplicate11(int n)
    {
        sc = new Scanner(System.in);
        ar = new int[n];
    }

    public void store()
    {
        System.out.println("Enter the values for the array");
        for (int i = 0; i < ar.length-1; i++)
        {
            ar[i] = sc.nextInt();
        }
    }

    public void remove()
    {
        m = 0;
        int n = 0;
        for (int i = 0; i < ar.length; i++)
        {
            if ( ar[i] != n)
            {
                for (int j = i + 1; j < ar.length; j++)
                {
                    if (ar[i] == ar[j])
                    {
                        n = ar[i];
                        m = m + 1;
                        for (int k = 0; k < ar.length - 1 - j; k++)
                        {
                            ar[j + k] = ar[j + 1 + k];
                        }

                    }
                }
            }
        }
    }

    public void display()
    {
        if(m != 0)
        {
            System.out.println("New array after removal is ");
            for (int i = 0; i < ar.length - 1; i++)
            {
                System.out.print(ar[i] + " ");
            }
        }
        else
        {
            System.out.println("Array remains same as no common values");
            for (int i = 0; i < ar.length - m; i++)
            {
                System.out.println(ar[i] + " ");
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        RemoveDuplicate11 s = new RemoveDuplicate11(n+1);
        s.store();
        s.remove();
        s.display();



    }
}
