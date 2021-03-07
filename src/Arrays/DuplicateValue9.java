package Arrays;

import java.util.Scanner;

public class DuplicateValue9
{
    private Scanner sc;
    private int ar[];

    public DuplicateValue9(int n)
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

    public void findingDuplicate()
    {
        int m = 0;
        for (int i = 0; i < ar.length; i++)
        {
            for (int j = i+1; j < ar.length; j++)
            {
                if(ar[i] == ar[j])
                {
                    m = m+1;
                    System.out.print(" Duplicate number is " +ar[i] + " ");
                }
            }
        }
        if(m == 0)
        {
            System.out.println("There are no duplicates ");
        }
    }

    public static void main(String[] args)
    {
        System.out.println(" Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        DuplicateValue9 s = new DuplicateValue9(n);
        s.store();
        s.findingDuplicate();
    }
}
