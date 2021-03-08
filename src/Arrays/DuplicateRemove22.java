//removing duplicate values and returning the new length of the array
package Arrays;

import java.util.Scanner;

public class DuplicateRemove22
{
    private Scanner sc;
    private int ar[];

    public DuplicateRemove22(int n)
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

    public void methodToRemove()
    {
        int m = 0,n= Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] != n)
            {
                for (int j = i + 1; j < ar.length; j++)
                {
                    if (ar[i] == ar[j])
                    {
                        m++;
                        n = ar[i];
                    }
                }
            }
        }
        System.out.println("New length of the array will be " + (ar.length-m));
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        DuplicateRemove22 s = new DuplicateRemove22(n);
        s.store();
        s.methodToRemove();
    }
}
