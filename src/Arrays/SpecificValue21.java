//check if the array contains two specified value 65 and 77
package Arrays;

import javax.jws.soap.SOAPMessageHandlers;
import java.util.Scanner;

public class SpecificValue21
{
    private Scanner sc;
    private int ar[];

    public SpecificValue21(int n)
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

    public void checkValue()
    {
        int m = 0, n = 0;
        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] == 65)
            {
                m++;
            }
            if (ar[i] == 77)
            {
                n++;
            }
        }
        if (m > 0 && n > 0)
        {
            System.out.println("It contains the specific value");
        }
        else
        {
            System.out.println("It does not contain the specific values");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        SpecificValue21 s = new SpecificValue21(n);
        s.store();
        s.checkValue();
    }
}
