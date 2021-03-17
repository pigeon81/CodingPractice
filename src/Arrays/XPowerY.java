//to find no of pairs in an array where x ki power y > y ki power x
package Arrays;

import java.util.Scanner;

public class XPowerY
{
    Scanner sc ;
    int ar[];
    int pow ;

    public XPowerY(int n)
    {
        ar = new int[n];
        sc = new Scanner(System.in);
        pow = 1;
    }

    public void store()
    {
        System.out.println("Enter the values for the array ");
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
    }

    public void selectXY()
    {
        int x,y,m,n;
        int k = 0;
        for (int i = 0; i < ar.length; i++)
        {
            for (int j = i+1; j < ar.length ; j++)
            {
                x = ar[i];
                y = ar[j];
                powerCalc(x,y);
                m = pow;
                pow = 1;
                powerCalc(y,x);
                n = pow;
                pow = 1;

                if (m > n)
                {
                    k++;
                }



            }
        }
        System.out.println("There are " +k + " no of pairs which follows the condition");
    }

    public void powerCalc(int x, int y)
    {
        for (int i = 0; i < y; i++)
        {
            pow = x * pow;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n = sc.nextInt();

        XPowerY s = new XPowerY(n);
        s.store();
        s.selectXY();
    }
}
