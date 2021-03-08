//To find the LCM of the two numbers 
package Arrays;

import java.util.Scanner;

public class Lcm28
{
    private Scanner sc;

    public Lcm28()
    {
        sc = new Scanner(System.in);
    }

    public void getLcm()
    {
        System.out.println("Enter the value of the first number ");
        int n1 = sc.nextInt();

        System.out.println("Enter the value of the second number ");
        int n2 = sc.nextInt();

        int m = 0, n = 0, count = 0;
        for (int i = 1; i <= n2; i++)
        {
            if (count == 0)
            {
                m = n1 * i;
                for (int j = 1; j <= n1; j++)
                {
                    n = n2 * j;
                    if (m == n)
                    {
                        count++;
                        System.out.println("LCM of the two numbers is " + m);
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Lcm28 s = new Lcm28();
        s.getLcm();
    }

}
