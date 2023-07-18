import java.util.Scanner;
class Prime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Helper h = new Helper();
        //h.ans(n);
        boolean ans = h.recursion(n,3);
        if(ans) System.out.println("yes");
        else    System.out.println("no");
    }
}
class Helper
{
    void ans(int n)
    {
        // Method 1 full loop TC O(n)
        boolean ans = true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                ans = false;
            }
        }
        if(ans)     System.out.println(n+" is  a prime number");
        else        System.out.println(n+" is not a prime number");

        //Method 2 Optimization by break condition
        ans = true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                ans = false;
                break;
            }
        }
        if(ans)     System.out.println(n+" is  a prime number");
        else        System.out.println(n+" is not a prime number");

        //Method 3 Optimization by n/2 iterations
        ans = true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                ans = false;
                break;
            }
        }
        if(ans)     System.out.println(n+" is  a prime number");
        else        System.out.println(n+" is not a prime number");

        //Method 4 Optimization by √n
        ans = true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                ans = false;
                break;
            }
        }
        if(ans)     System.out.println(n+" is  a prime number");
        else        System.out.println(n+" is not a prime number");

        //Method 5 Optimization by skipping even iteration
        ans = true;
       if((n & 1)==0)
       {
            ans=false;
       }
       else
       {
            for(int i=3;i<=Math.sqrt(n);i+=2)
            {
                if(n%i==0)
                {
                    ans = false;
                    break;
                 }
             }
       }
        if(ans)     System.out.println(n+" is  a prime number");
        else        System.out.println(n+" is not a prime number");

    }
    //Method 6 Basic Recursion technique
    boolean recursion(int n,int i)
    {
        if(i==n)  return true;
        
        if(n%i==0)  return false;
        

        return recursion(n,i+=1);

    }

}