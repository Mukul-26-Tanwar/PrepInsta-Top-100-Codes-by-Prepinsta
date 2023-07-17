import java.util.*;


 class HelloWorld 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Helper h = new Helper();
        h.ans(num);
    }
}

class Helper
{
    public void ans(int num)
    {
        if(num<0)       System.out.print( "Negative");
        else if(num>0)  System.out.print("Positive");
        else            System.out.print("Zero");
    }
}