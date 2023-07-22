import java.util.Scanner;
class PerfectNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Helper h = new Helper();
        int res = h.ans(num);
        if(res==num)    System.out.print("Yes");
        else            System.out.print("no");

    }
}
class Helper
{
    int ans(int num)
    {
        int sum=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)    sum += i;
        }
        return sum;
    }
}