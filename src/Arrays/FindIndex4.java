package Arrays;

import java.util.Scanner;
public class FindIndex4
{
    public static void main(String[] args)
    {
        int ar[] = new int[6];
        ar[0] = 9;
        ar[1] = 8;
        ar[2] = 7;
        ar[3] = 6;
        ar[4] = 5;
        ar[5] = 4;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number whose index you want to  know ");
        int n = sc.nextInt();

        int m = 0;
        for (int i = 0; i < 6; i++)
        {
            if ( ar[i] == n)
            {
                m = m + 1;
                System.out.println(" index of the number you entered is  " + i);
                break;
            }

        }
        if ( m == 0)
        {
            System.out.println(" Enter a valid number which is present in the array");
        }



    }
}
