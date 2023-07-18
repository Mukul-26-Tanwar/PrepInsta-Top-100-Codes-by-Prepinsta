import java.util.Scanner;

class Sum
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Helper h = new Helper();
        int sum=h.recursion(n,0);
        System.out.println(sum);
    }
}

class Helper
{
    void ans(int n)
    {
        System.out.println("Method 1 using loop TC: O(n)"); //Time Complexity
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum += i;
        }
        System.out.println("Sum of first N number is :"+sum);
        sum=0;
        System.out.println("Method 1 using Formula TC: O(1)"); //Time Complexity
        sum = (n*(n+1))/2;
        System.out.println("Sum of first N number is :"+sum);
        
    }
    // Method 3 Recursion
    int recursion(int n,int sum)
    {
        if(n==0)
        {
            return sum;
        }
        sum += n;
        return recursion(n-1,sum);
    }
}
