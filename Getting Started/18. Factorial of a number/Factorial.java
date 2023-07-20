import java.util.Scanner;

class Factorial
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Helper h = new Helper();
        int ans = h.recursion(n);
        System.out.print(ans);

        System.out.println();

        h.ans(n);

        
    }
}
class Helper
{
    int recursion(int n)//Methpd 1
    {
        if(n==1)    return 1;
        return n*recursion(n-1);
    }
    void ans(int n)//Method 2
    {
        int ans=1;
        for(int i=2;i<=n;i++)
        {
            ans *= i;
        }
        System.out.print(ans);
    }
}