import java.util.Scanner;
class Greatest
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        Helper h = new Helper();
        h.ans(a,b);
    }
}
class Helper
{
    void ans(int a,int b)
    {
        if(a>b)     System.out.println(a+" is Greatest");
        else        System.out.println(b+" is Greatest");
    }
}