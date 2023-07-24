import java.util.Scanner;
class HCF
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Helper h = new Helper(); 
        int n = h.hcf(num1,num2);
        System.out.print(n);
    }
}
class Helper
{
    int ans(int num1,int num2)//Method 1
    {
        int ans=0;
        for(int i=1;i<=num1 || i<=num2;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                ans= i;
            }
        }
        return ans;
    }
    int whileLoop(int n1,int n2)//Method 2
    {
        while(n1!=n2)
        {
            if(n1>n2)
            {
                n1=n1-n2;
            }
            else    n2=n2-n1;
        }
        return n1;
    }
    int hcf(int a,int b)//Method 3 mostly used
    {
        if(b==0)    return a;
        return hcf(b,a%b);
    }

}