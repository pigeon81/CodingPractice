package Arrays;

import java.util.Scanner;

public class BubbleSortDecrease
{
    private int ar[];
    private Scanner sc;

    public BubbleSortDecrease(int n)
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
        int temp,flag;
        for (int i = 0; i < ar.length; i++)
        {
            flag = 0;
            for (int j = 0; j < ar.length-1-i ; j++)
            {
                if (ar[j] < ar[j + 1])
                {
                    temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                    flag++;
                }
            }
            if(flag == 0)
            {
                break;
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
        int n = sc .nextInt();

        BubbleSortDecrease s =  new BubbleSortDecrease(n);
        s.store();
        s.sort();
        s.display();
    }
}
