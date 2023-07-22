import java.util.Scanner;

class Strong
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        Helper h = new Helper();
        int res = h.ans(num);
        if(res == res)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }

}
class Helper
{
    int ans(int num)
    {
        int sum=0;
        while(num>0)
        {
            sum += fac(num%10);
            num /=10;
        }
        return sum;
    }
    int fac(int num)
    {
        int ans=1;
        for(int i=2;i<=num;i++)
        {
            ans *=i;
        }
        return ans;
    }

}