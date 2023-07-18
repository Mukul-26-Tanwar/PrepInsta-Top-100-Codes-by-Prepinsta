import java.util.Scanner;

class Greatest
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Helper h = new Helper();
        h.ans(a,b,c);
    }
}
class Helper
{
    
    void ans(int a,int b,int c)
    {
        // Method 1 using if-else
        if(a>b)
        {
            if(a>c)     System.out.println(a+" is Greatest");
            else        System.out.println(c+" is Greatest");
        }     
        else
        {
            if(b>c)     System.out.println(b+" is Greatest");
            else        System.out.println(c+" is Greatest");
        }
        // Method 2 using function
        System.out.println(Math.max(Math.max(a,b),c)+" is Greatest");
    }

}