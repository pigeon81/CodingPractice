package Arrays;

import java.util.Scanner;
public class InsertElement6
{
    private Scanner sc;
    private int ar[];

    public InsertElement6(int n)
    {
        sc = new Scanner(System.in);
        ar = new int[n];
    }

    public void store()
    {
        System.out.println(" Enter the values for the array");

        for (int i = 0; i < ar.length-1; i++)
        {
            ar[i] = sc.nextInt();
        }
    }

    public void insert()
    {
        System.out.println(" Enter the value which you want to insert");
        int e = sc.nextInt();
        System.out.println(" Enter the position where you want to insert the element");
        int p = sc.nextInt();
        //e stores the value of the element

        for (int i = 0; i < ar.length-1-p; i++)
        {
            ar[ar.length-1-i] = ar[ar.length-2-i];
        }
        ar[p] = e;

    }

    public void display()
    {
        System.out.println(" The desired array is ");

        for (int i = 0; i < ar.length ; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the size of the array");
        int n = sc.nextInt();

        InsertElement6 s = new InsertElement6(n+1);
        s.store();
        s.insert();
        s.display();
    }
}
