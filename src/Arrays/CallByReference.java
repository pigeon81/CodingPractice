package Arrays;

import java.util.Scanner;

public class CallByReference
{
    int ar[];

    public CallByReference(int n)
    {
        ar = new int[n];
    }

    public void display(int[] ar)
    {
        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(ar[i] + "\t");
        }
        System.out.println();

    }

    public void modify(int[] ar)
    {
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = 1;
        }
        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(ar[i] + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();


        CallByReference s = new CallByReference(n);
        s.display(s.ar);
        s.modify(s.ar);
        s.display(s.ar);
        /*here we can clearly see as the array passed to the method display should contain zeroes but it has been modified as it is stored in heap and both the
        arrays pointing towards the same location thats why having the same value
         */
    }
}