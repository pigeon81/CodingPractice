package Arrays;

import java.util.Scanner;

public class CommonValues10
{
    private Scanner sc;
    private int ar[];
    private int ar1[];

    public CommonValues10(int n1, int n2)
    {
        sc = new Scanner(System.in);
        ar = new int[n1];
        ar1 = new int[n2];
    }

    public void store()
    {
        System.out.println(" Enter the values for the first array");
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter the values for the second array");
        for (int i = 0; i < ar1.length; i++)
        {
            ar1[i] = sc.nextInt();
        }
    }

    public void findCommon()
    {
        int m = 0;
        for (int i = 0; i < ar.length; i++)
        {
            for (int j = 0; j < ar1.length; j++)
            {
                if(ar[i] == ar1[j])
                {
                    m = m + 1;
                    System.out.println("Common value"+m +"   " +ar[i] +" ");
                }
            }
        }
        if(m == 0)
        {
            System.out.println("There are no common values present");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the first array");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        System.out.println("Enter the size of the second array");
        int n2 = sc.nextInt();

        CommonValues10 s = new CommonValues10(n1,n2);
        s.store();
        s.findCommon();
    }

}
