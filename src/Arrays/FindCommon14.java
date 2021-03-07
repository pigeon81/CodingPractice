package Arrays;

import java.util.Scanner;

public class FindCommon14
{
    private Scanner sc;
    private int ar1[];
    private int ar2[];
    private int ar3[];
    private int commonElementsCount;

    public FindCommon14(int n1, int n2, int n3)
    {
        sc = new Scanner(System.in);
        ar1 = new int[n1];
        ar2 = new int[n2];
        ar3 = new int[n3];
        commonElementsCount = 0;
    }

    public void store(int[] ar)
    {
        System.out.println("Enter the values for the  array");
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
    }

    public void commonElements(int[] ar)
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
                            commonElementsCount++;
                            ar[commonElementsCount-1] = ar3[k];
                        }
                    }
                }
            }
        }
        if(commonElementsCount == 0)
        {
            System.out.println("There are no common elements present in all 3 arrays");
        }
    }

    public void getCommon(int[] ar)
    {
        System.out.println("The common elements are ");
        for (int i = 0; i < ar.length; i++)
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
        FindCommon14 s = new FindCommon14(n1,n2,n3);
        s.store(s.ar1);
        s.store(s.ar2);
        s.store(s.ar3);

        int min = Math.min(n1, n2);
        min = Math.min(min, n3);
        int[] ar = new int[min];
        s.commonElements(ar);
        s.getCommon(ar);
    }

}
