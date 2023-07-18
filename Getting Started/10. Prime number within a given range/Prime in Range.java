import java.util.Scanner;

class PrimeRange
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Helper h = new Helper();
        for(int i=2;i<=n;i++)
        {
            if(h.ans(i))
            {
                System.out.println(i+" ");
            }
        }  
    }
}
class Helper
{
    boolean ans(int n)
    {
        for(int i=2;i<n;i++) //you can change the n to n/2, _/n(root n) you can also inc the increment i++ to i += 2 ans start the loop from 3
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}