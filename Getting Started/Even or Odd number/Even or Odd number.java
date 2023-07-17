import java.util.Scanner;
class OddEven
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Helper h = new Helper();
        h.ans(num);
    }
}
class Helper
{
    void ans(int num)
    {
        System.out.println("Method 1 using mod (%)");

        if(num%2==0)    System.out.println(num+" is Even");
        else            System.out.println(num+" is Odd");

        System.out.println("Method 2 using bit operator (&)");

        if((num & 1)==0)    System.out.println(num+" is Even");
        else                System.out.println(num+" is Odd");

    }
}