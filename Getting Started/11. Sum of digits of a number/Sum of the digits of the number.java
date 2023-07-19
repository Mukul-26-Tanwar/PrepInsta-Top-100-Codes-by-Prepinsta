import java.util.Scanner;

class Sum 
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
        int sum = 0;
        while(num>0)
        {
            
            sum += num%10;
            num/=10;
        }
        System.out.print(sum);
    }
    int recursion(int num,int sum) //Method 2
    {
        if(num==0)  return sum;
        sum += num%10;
        return recursion(num/10,sum);

    }
}