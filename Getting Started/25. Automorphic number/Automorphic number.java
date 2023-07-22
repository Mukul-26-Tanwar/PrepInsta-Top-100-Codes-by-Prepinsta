import java.util.Scanner;
class AutomorphicNumber
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
        int n=num*num;
        while(num>0)
        {
            if(num%10 != n%10)      return false;
            num /=10;
            n /=10;
        }
        return true;
    }
    
}