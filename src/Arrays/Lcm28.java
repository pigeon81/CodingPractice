//To find the LCM of the two numbers
package Arrays;

import java.util.Scanner;

public class Lcm28
{
    private Scanner sc;

    public Lcm28()

    {
        sc = new Scanner(System.in);
    }
     // use proper names int hcf, int a, int b
    public void getLcm(int n1,int n2)
    {
        //we know LCM * HCF = A * B;
        Hcf27 h = new Hcf27();
        int n = h.getHcf(n1,n2);
        int lcm = (n1 * n2) / n;
        System.out.println("LCM of the two numbers is " +lcm);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the first number ");
        int n1 = sc.nextInt();

        System.out.println("Enter the value of the second number ");
        int n2 = sc.nextInt();
        // do this in lcm method 

        Lcm28 s = new Lcm28();
        s.getLcm(n1,n2);
    }

}
