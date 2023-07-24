import java.util.Scanner;
class OctalToDecimal
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Octal = sc.nextInt();
        //int num2 = sc.nextInt();
        Helper h = new Helper(); 
        int n = h.ans(Octal);
        System.out.print(n);
    }
}
class Helper
{
    int ans(int Octal)
    {
        int decimal=0;
        int n=0;

        while(Octal>0)
        {
            int temp = Octal%10;
            decimal += temp*Math.pow(8,n);
            Octal /=10;
            n++;
        }
        return decimal;

    }
}