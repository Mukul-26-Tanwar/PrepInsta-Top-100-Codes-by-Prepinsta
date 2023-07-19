import java.util.Scanner;

class Palindrome 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Helper h =new Helper();
        h.ans(num);
        int ans=h.recursion(num,0);
        if(ans==num)    System.out.print("Yes");
        else            System.out.print("No");
    }
}
class Helper
{
    void ans(int num) //Method 1
    {
        int n=num;
        int reverse = 0;
        while(num>0)
        {
            reverse *=10;
            reverse += num%10;
            num/=10;
        }
        if(reverse==n)      System.out.print("Yes");
        else                System.out.print("No");
    }
    int recursion(int num,int reverse) //Method 2
    {
        if(num==0)  return reverse;
        reverse *=10;
        reverse += num%10;
        return recursion(num/10,reverse);

    }
}