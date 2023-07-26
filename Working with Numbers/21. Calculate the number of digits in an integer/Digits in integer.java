import java.util.Scanner;
class Digits
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Helper h = new Helper();
        int n=h.noOfDigits2(number);
        System.out.print(n);    
    }
}
class Helper
{
    int noOfDigits(int number)//Method 1
    {
        return (int)Math.log10(number)+1;
    }
    int noOfDigits2(int number)//Method 2
    {
      int i=0;
      while(number>0)
      {
        number /=10;
        i++;
      }
        return i;
    }
}