import java.util.Scanner;
class Sum
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        Helper h = new Helper();
        h.ans(a,b);
        int ans=h.recursion(a,b);
        System.out.println(ans);

    }
}
class Helper
{
    void ans(int a,int b)
    {
        int sum=0;
        // Method 1 using loop
        for(int i=a;i<=b;i++)
        {
            sum += i;
        }
        System.out.println(sum);

        // Method 2 using formula
        sum = ((b*(b+1))/2) - ((a*(a+1))/2) + a;
        System.out.println(sum);
    }

    // Method 3 using Recursion
    int recursion(int a,int b)
    {
        if(b==a)
        {
            return b;
        }
        return b+recursion(a,b-1);
    }
}