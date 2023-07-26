import java.util.Scanner;
class Count
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int key = sc.nextInt();
        Helper h = new Helper();
        int n=h.repeat(number,key);
        System.out.print(n);    
    }
}
class Helper
{
    int repeat(int number,int x)
    {
        int count=0;
        while(number>0)
        {
            int temp = number%10;
            if(temp==x)     count++;
            number /=10;
        }
        return count;
    }
}