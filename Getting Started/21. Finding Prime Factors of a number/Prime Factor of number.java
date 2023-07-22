import java.util.Scanner;

class PrimeFactor
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a      = sc.nextInt();
        // int b    = sc.nextInt();
        Helper h   = new Helper();
        h.ans(a);

        
    }
}
class Helper
{
    void ans(int num)
    {
        for(int i=1;i<=num/2;i++)
        {
            if(isPrime(i))
            {
                int x =num;
                while(x%i==0)
                {
                    System.out.print(i+" ");
                    x /=i;
                }
            }
        }
       
    }
    boolean isPrime(int num)
    {
        if(num==1) return false;
        if(num==2) return true;
        if(num%2==0) return false;
        for(int i=3;i<=Math.sqrt(num);i +=2)
        {
            if(num%i==0)    return false;
        }
        return true;
    }
}