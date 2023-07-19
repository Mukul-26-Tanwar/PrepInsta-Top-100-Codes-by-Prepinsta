import java.util.Scanner;
 
class Armstrong
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Helper h =new Helper();

        int ans = h.ans(num);

        if(ans == num)      System.out.print("Yes");
        else                System.out.print("No");

        int len = h.len(num);

        int res = h.recursion(num,len,0);

        if(res == num)      System.out.print("Yes");
        else                System.out.print("No");
        
    }
}
class Helper
{
    int len(int num) // counting the digits of the number 12->2, 371->3
    {
        return (int) Math.log10(num)+1;
    }
    int ans(int num) //Method 1
    {
        int len=len(num);
        int sum=0;
        while(num>0)
        {
            
            sum += Math.pow(num%10,len);
            num /= 10;
        }
        return sum;
    }
    int recursion(int num,int len,int sum)  //Method 2
    {
        if(num==0)          return sum;
        sum += Math.pow(num%10,len);
        
        return recursion(num/10,len,sum);
    }
}