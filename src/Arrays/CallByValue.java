package Arrays;

public class CallByValue
{
    public void modify(int r2)
    {
        r2 = 40;
        System.out.println(r2);
    }

    public static void main(String[] args)
    {
            CallByValue s = new CallByValue();
            // when we call by value we will get different results
            int r1 = 30;
            s.modify(r1);
            // as two different variables r1 and r2 is stored in the stack
        System.out.println(r1);
    }
}
