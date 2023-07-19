import java.util.Scanner;

class Reverse 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Helper h =new Helper();
        int ans=h.recursion(num,0);
        System.out.print(ans);
    }
}
class Helper
{
    void ans(int num) //Method 1
    {
        int reverse = 0;
        while(num>0)
        {
            reverse *=10;
            reverse += num%10;
            num/=10;
        }
        System.out.print(reverse);
    }
    int recursion(int num,int reverse) //Method 2
    {
        if(num==0)  return reverse;
        reverse *=10;
        reverse += num%10;
        return recursion(num/10,reverse);

    }
}