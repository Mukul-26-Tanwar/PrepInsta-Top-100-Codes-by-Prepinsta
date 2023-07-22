import java.util.Scanner;
class HarshadNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         
        Helper h = new Helper();
        if(h.ans(num))
        {
            System.out.print("YES");
        } 
        else
        {
            System.out.print("NO");
        }


       
    }
}
class Helper
{
    boolean ans(int num)
    {
        int sum=0;
        int n=num;
        while(n>0)
        {
            sum +=n%10;
            n /=10;
        }
        if(num%sum==0)  return true;
        else            return false;
    }
}