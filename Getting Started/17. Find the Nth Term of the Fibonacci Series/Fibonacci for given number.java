import java.util.Scanner;

class Fibonacci
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Helper h = new Helper();
        int ans = h.fib(n);
        System.out.print(ans);

        
    }
}
class Helper
{
    static int fib(int n)//Method 1 
    {   
     if (n <= 1)    //Base Condition
     return n;
     return fib(n - 1) + fib(n - 2);
    }
}