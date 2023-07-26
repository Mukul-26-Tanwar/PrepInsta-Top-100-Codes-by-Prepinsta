import java.util.*;
class SumOfPrime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Helper h = new Helper();

        boolean[] prime = new boolean[number+1];
        h.primeNumber(number,prime);
        h.find(prime,number);

    }
}
class Helper
{
    void primeNumber(int num,boolean[] prime)
    {
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<=num;i++)
        {
            if(prime[i])
            {
                for(int j=i*i;j<=num;j +=i)
                {
                    prime[j]=false;
                }
            }
        }
    }
    void find(boolean[] prime,int num)
    {
        for(int i=2;i<prime.length;i++)
        {
            for(int j=i;j<prime.length;j++)
            {
                if(prime[i]==true && prime[j]==true && i+j==num)
                {
                    System.out.print( i+"+"+j+"="+num);
                    System.out.println();
                }
                
            }
        }
    }
}