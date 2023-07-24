import java.util.Scanner;
class LCM
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Helper h = new Helper(); 
        int n = h.usingHCF(num1,num2);
        System.out.print(n);
    }
}
class Helper
{
    int ans(int num1,int num2)//Mthod 1
    {
        int max = Math.max(num1,num2);
        for(int i=max;i<=num1*num2;i++)
        {
            if(i % num1 == 0 && i % num2 == 0)       return i;
        }
        return max;
    }
    int usingHCF(int a,int b)//formula (a*b)/hcf of a,b
    {
        return (a*b)/HCF(a,b);
    }
    int HCF(int a,int b)
    {
        if(b==0)    return a;
        return HCF(b,a%b);
    }
}