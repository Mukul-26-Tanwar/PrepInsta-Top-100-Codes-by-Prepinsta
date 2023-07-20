import java.util.Scanner;

class Power
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int pow    = sc.nextInt();
        Helper h   = new Helper();
        int ans = h.recursion(n,pow);
        System.out.print(ans);

         System.out.println();

        h.loop(n,pow);

        System.out.println();
        System.out.print(Math.pow(n,pow));//Method 3

        
    }
}
class Helper 
{
    void loop(int num,int pow)//Method 1
    {
        int ans =num;
        for(int i=1;i<pow;i++)
        {
            ans *=num;
        }
        System.out.print(ans);
    }
    int recursion(int n,int pow)//Method 2
    {
        if(pow==0)  return 1;

        int ans=0;
        if((pow & 1)==0)
        {
            ans = recursion(n,pow/2);
            ans = ans * ans;
        }
        else
        {
            ans = n;
            ans = ans * recursion(n,pow-1);
        }
        return ans;
    }
}