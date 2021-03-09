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
        int m = 0;
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
        if (n1 > n2)
        {
            System.out.println(s.getHcf(n1,n2));
        }
        if (n2 > n1)
        {
            System.out.println(s.getHcf(n2,n1));
        }
    }
}
