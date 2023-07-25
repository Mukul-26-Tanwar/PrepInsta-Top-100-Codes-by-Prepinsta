import java.util.Scanner;
class Permutaion
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Helper h = new Helper();

        int n=sc.nextInt();         int r = sc.nextInt();
        int ans = h.possibleSeat(n,r);
        System.out.print(ans);
    }
}
class Helper
{
    int fact(int x)
    {
        int fact =1;
        for(int i=2;i<=x;i++)
        {
            fact *= i;
        }
        return fact;
    }
    int possibleSeat(int n,int r)
    {
        int N=fact(n);
        int div =fact(n-r);
        return N/div;
    }
}