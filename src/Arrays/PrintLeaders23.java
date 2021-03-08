//to print al the leaders
package Arrays;

import java.util.Scanner;

public class PrintLeaders23
{
    private Scanner sc;
    private int ar[];

    public PrintLeaders23(int n)
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

    public void findLeaders()
    {
        for (int i = 0; i < ar.length; i++)
        {
            int m = 0;
            for (int j = i+1; j < ar.length; j++)
            {
                if(ar[i] > ar[j])
                {
                    m++;
                }
                if(m == ar.length-1-i)
                {
                    System.out.print(ar[i] + " ");
                }
            }
        }
        System.out.print(ar[ar.length-1]);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrintLeaders23 s = new PrintLeaders23(n);
        s.store();
        s.findLeaders();
    }

}
