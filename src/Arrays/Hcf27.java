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

    public void getHcf()
    {
        System.out.println("Enter the first number ");
        int n1 = sc.nextInt();

        System.out.println("Enter the second number ");
        int n2 = sc.nextInt();

        int m = 0;
        if ( n1 > n2 )
        {
            for (int i = 1; i <= n2; i++)
            {
                if (n1 % i == 0 && n2 % i == 0)
                {
                    if (i > m)
                    {
                        m = i;
                    }
                }
            }
        }
        if ( n2 > n1 )
        {
            for (int i = 1; i <= n1; i++)
            {
                if (n1 % i == 0 && n2 % i == 0)
                {
                    if (i > m)
                    {
                        m = i;
                    }
                }
            }
        }
        System.out.println("HCF of the given number is " +m);
    }

    public static void main(String[] args)
    {
        Hcf27 s = new Hcf27();
        s.getHcf();
    }
}
