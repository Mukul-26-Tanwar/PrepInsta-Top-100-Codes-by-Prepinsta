import java.util.Scanner;
class PerfectSqur
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


        if(h.fun(num))
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
        int x =(int) Math.sqrt(num);
        return (x*x)==num;
    }
    boolean fun(int num)
    {
        if(Math.ceil((double)Math.sqrt(num))==Math.floor((double)Math.sqrt(num)))   return true;

        return false;
    }
}