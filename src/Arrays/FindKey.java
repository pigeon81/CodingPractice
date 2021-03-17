//to find a particular key in the K sections of an array
package Arrays;

import java.util.Scanner;

public class FindKey
{
    private Scanner sc;
    private int ar[];
    int n;
    int j;
    int m;

    public FindKey(int n)
    {
        sc = new Scanner(System.in);
        ar = new int[n];
        m = 0;
        j = 0;
    }

    public void store()
    {
        System.out.println("Enter the values for the array");
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
    }

    public void distribution(int k,int key)
    {
        int k1,k2;
        //k is the number of sections in which the array is distributed
        k1 = ar.length / k ;
        for (int i = 1; i <= k1; i++)
        {
            k2 = k * i;
            toLookForKey(key,k2,k);
        }
        k2 = ar.length-1;
        toLookForKey(key,k2,k);
        if (k2 == j)
        {
            if (ar[k2] == key)
            {
                if (ar.length % k == 0)
                {
                    System.out.println("key is present in the " +ar.length/k + " section");
                }
                else
                {
                    System.out.println("key is present in the " +(ar.length/k + 1) + " section");
                }
            }
        }

        if (m == 0)
        {
            System.out.println("Key is not present in the array");
        }
    }

    public void toLookForKey(int key,int k2,int k)
    {
        for (int i = j; i < k2; i++)
        {
            n++;
            int r;
            if (n % k == 0)
            {
                 r = n/k;
            }
            else
            {
                 r = n/k +1;
            }
            if (ar[i] == key)
            {
                m++;
                System.out.println("Yes key is present in the  " + r + "  section");
                j = k2 ;
                n = k * r;
                break;
            }
        }
        j = k2 ;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        System.out.println("Enter the value of key for which you want to check");
        int key = sc.nextInt();

        System.out.println("Enter the size of the section");
        int k = sc.nextInt();

        FindKey s = new FindKey(n);
        s.store();
        s.distribution(k,key);

    }
}
