// hcf of two numbers
package Arrays;

import java.util.Scanner;

public class Hcf27
{
    private Scanner sc;

    public Hcf27()
    {
        sc = new Scanner(System.in);
    }



    public int getHcf(int n1, int n2)
    {
        int a = 0;
        if (n2 > n1)
        {
            a = n1;
            n1 = n2;
            n2 = a;
        }
        int m = 1;// could have initialised with 1. 1 is a factor of every number.
        {
            for (int i = 1; i <= n2; i++)
            {
                if (n1 % i == 0 && n2 % i == 0)
                {
                     m = i;
                }
            }
        }
        return m;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int n1 = sc.nextInt();

        System.out.println("Enter the second number ");
        int n2 = sc.nextInt();

        Hcf27 s = new Hcf27();

        //should have been done in hcf method. method should've been called only once
            System.out.println(s.getHcf(n1,n2));

    }
}
