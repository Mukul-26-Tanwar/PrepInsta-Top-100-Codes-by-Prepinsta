import java.util.Scanner;
class SumOfFractions
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Helper h = new Helper();

        int num1=sc.nextInt();      int den1=sc.nextInt();      int num2=sc.nextInt();            int den2=sc.nextInt();
        h.additionOfFaractions(num1,num2,den1,den2);
        
    }
}
class Helper
{
    int HCF(int a,int b)
    {
        if(b==0)    return a;
        return HCF(b,a%b);
    }
    void additionOfFaractions(int num1,int num2,int den1,int den2)
    {
        if(den1==den2)
        {
            System.out.print(num1+num2+"/"+den1);
        }
        else
        {
            int hcf =HCF(den1,den2);
            int lcm =(den1*den2)/hcf;

            int ansNum1 = num1*(lcm/den1);
            int ansNum2 = num2*(lcm/den2);
            int ansNum  = ansNum1+ansNum2;

            int min = Math.min(ansNum,lcm);
            for(int i=2;i<=min;i++)
            {
                if(ansNum%i==0 && lcm%i==0)
                {
                    ansNum = ansNum/i;
                    lcm = lcm/i;
                }
            }

            System.out.print(ansNum+"/"+lcm);
        }
    }
}