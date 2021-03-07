package Arrays;

import java.util.Scanner;
public class Sum1
{
    private int ar[];
    private Scanner sc;

    public Sum1(int n)

    {
        ar = new int[n];
        sc = new Scanner(System.in);
    }

    public void store()
    {
        System.out.println("Enter all the values for the array");
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
    }

    public void displaySum()
    {
        int s = 0;
        for (int i = 0; i < ar.length; i++)
        {
            s = ar[i] + s;
        }
        System.out.println(s + " is the sum of the values in the array ");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER the size of the array");
        int n = sc.nextInt();
        Sum1 s = new Sum1(n);
        s.store();
        s.displaySum();


    }
}




