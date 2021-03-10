package Arrays;

import java.util.Scanner;

public class SelectionSort
{
    private int ar[];
    private Scanner sc;

    public SelectionSort(int n)
    {
        ar = new int[n];
        sc = new Scanner(System.in);
    }

    public void store()
    {
        System.out.println("Enter the values for the array");
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
    }

    public void sort()
    {
        int min,temp;
        for (int i = 0; i < ar.length; i++)
        {
            min = i;
            for (int j = i+1; j < ar.length; j++)
            {
                if (ar[j] < ar[min])
                {
                    temp = ar[min];
                    ar[min] = ar[j];
                    ar[i] = ar[min];
                    ar[j] = temp;
                }
            }
        }
    }

    public void display()
    {
        for (int i = 0; i < ar.length; i++)
        {
            System.out.println(ar[i] + "\t");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        SelectionSort s = new SelectionSort(n);
        s.store();
        s.sort();
        s.display();
    }
}
