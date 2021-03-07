package Arrays;

import java.util.Scanner;

public class FindCommon14
{
    private Scanner sc;
    private int ar1[];
    private int ar2[];
    private int ar3[];
    private int ar[];
    int m;

    public FindCommon14(int n1, int n2, int n3, int n4)
    {
        sc = new Scanner(System.in);
        ar1 = new int[n1];
        ar2 = new int[n2];
        ar3 = new int[n3];
        ar = new int[n4];
        m = 0;
    }

    public void store()
    {
        System.out.println("Enter the values for the first array");
        for (int i = 0; i < ar1.length; i++)
        {
            ar1[i] = sc.nextInt();
        }

        System.out.println("Enter the values for the second array");
        for (int i = 0; i < ar2.length; i++)
        {
            ar2[i] = sc.nextInt();
        }

        System.out.println("Enter the values for the third array");
        for (int i = 0; i < ar3.length; i++)
        {
            ar3[i] =sc.nextInt();
        }
    }

    public void commonElements()
    {
        for (int i = 0; i < ar1.length; i++)
        {
            for (int j = 0; j < ar2.length; j++)
            {
                if(ar1[i] == ar2[j])
                {
                    for (int k = 0; k < ar3.length; k++)
                    {
                        if(ar2[j] == ar3[k])
                        {
                            m = m + 1;
                            ar[m-1] = ar3[k];
                        }
                    }
                }
            }
        }
        if(m == 0)
        {
            System.out.println("There are no common elements present in all 3 arrays");
        }
    }

    public void getCommon()
    {
        System.out.println("The common elements are ");
        for (int i = 0; i < m; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the first array");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        System.out.println("Enter the size of the second array");
        int n2 = sc.nextInt();

        System.out.println("Enter the size of the third array");
        int n3 = sc.nextInt();
        int n4 = 0;
        if (n1 < n2 && n1 < n3)
        {
               n4 = n1;
        }
        if (n2 < n1 && n2 < n3)
        {
            n4 = n2;
        }
        if (n3 < n1 && n3 < n2)
        {
            n4 = n3;
        }
        FindCommon14 s = new FindCommon14(n1,n2,n3,n4);
        s.store();
        s.commonElements();
        s.getCommon();
    }

}
