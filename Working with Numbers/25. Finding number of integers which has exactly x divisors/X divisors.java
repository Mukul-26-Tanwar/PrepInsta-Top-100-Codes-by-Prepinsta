import java.util.*;
class XDivisors
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int x = sc.nextInt();
        Helper h = new Helper();
        int n=h.exactlyXDivisors(range,x);
        System.out.print(n);    
    }
}
class Helper
{
    int exactlyXDivisors(int range,int x)
    {
        int count=0;
        for(int i=1;i<=range;i++)
        {
            int currCount=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    currCount++;
                }
            }
            if(currCount==x)    count++;
        }
        return count;
    }
}