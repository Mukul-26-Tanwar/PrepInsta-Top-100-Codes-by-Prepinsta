import java.util.Scanner;
 
class Armstrong
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Helper h =new Helper();

        for(int i=a;i<=b;i++)
        {
            long ans = h.ans(i);
            if(ans==i)     
            {
                System.out.print(ans+" ");
            }
        }
        System.out.println();
        for(int i=a;i<=b;i++)
        {
            int len = h.len(i);
            long ans = h.recursion(i,len,0);
            if(ans==i)     
            {
                System.out.print(ans+" ");
            }
        }

        
    }
}
class Helper
{
    int len(int num) // counting the digits of the number 12->2, 371->3
    {
        return (int) Math.log10(num)+1;
    }
    long ans(int num) //Method 1
    {
        int len=len(num);
        long sum=0;
        while(num>0)
        {
            
            sum += Math.pow(num%10,len);
            num /= 10;
        }
        return sum;
    }
    long recursion(int num,int len,long sum)  //Method 2
    {
        if(num==0)          return sum;
        sum += Math.pow(num%10,len);
        
        return recursion(num/10,len,sum);
    }
}