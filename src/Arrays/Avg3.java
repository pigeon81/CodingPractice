package Arrays;

import java.util.Scanner;
public class Avg3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the size of the array");
        int n = sc.nextInt();

        int ar[] = new int[n];
        System.out.println(" Enter the values for the array");

        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();

        }
        double s = 0;
        for (int i = 0; i < ar.length; i++)
        {
            s = ar[i] + s;
        }
        s = s/ar.length;

        System.out.println(" the average is "+s);

    }
}
