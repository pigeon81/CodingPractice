package Arrays;

import java.util.Scanner;
public class ValueTest4
{
    public static void main(String[] args)
    {
        int ar[] = new int[5];
        ar[0] = 3;
        ar[1] = 5;
        ar[2] = 8;
        ar[3] = 9;
        ar[4] = 2;

        System.out.println(" Enter the value which you wanna check in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = 0;
        for (int i = 0; i < 5; i++)
        {
            if (ar[i] == n)
            {
                m = m + 1;
                System.out.println(" yes it is present in the array ");
                break;
            }

        }
        if ( m == 0)
        {
            System.out.println( " It is not present in the array ");
        }
    }
}

