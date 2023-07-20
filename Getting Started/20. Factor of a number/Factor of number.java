import java.util.Scanner;

class Factor
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a      = sc.nextInt();
        // int b    = sc.nextInt();
        Helper h   = new Helper();
        h.ans(a);

        
    }
}
class Helper
{
    void ans(int num)
    {
        for(int i=1;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                if(i==num/i) System.out.print(i+" ");
                else       System.out.print(i+" "+num/i+" "); 
            }
        }
        System.out.print(num);
    }
}