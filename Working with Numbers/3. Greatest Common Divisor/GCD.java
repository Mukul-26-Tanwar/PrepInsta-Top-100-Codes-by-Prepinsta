import java.util.Scanner;
class GCD
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Helper h = new Helper(); 
        int n = h.ans(num1,num2);
        System.out.print(n);
    }
}
class Helper
{
    int ans(int a,int b)
    {
        if(b==0)    return a;
        return ans(b,a%b);
    }
}