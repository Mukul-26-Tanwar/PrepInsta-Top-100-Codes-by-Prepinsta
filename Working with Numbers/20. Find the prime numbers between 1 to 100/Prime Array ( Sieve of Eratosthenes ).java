import java.util.*;
//Sieve of Eratosthenes
class PrimeRange
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Helper h = new Helper();
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        h.ans(n,arr);
        h.print(arr);
    }
}
class Helper
{
    void ans(int n,boolean[] arr)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(arr[i])
            {
                for(int j=i*i;j<=n;j += i)
                {
                    if(arr[j]==false)   continue;
                    else    arr[j]=false;  
                }
            }
        }
    }
    void print(boolean[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}