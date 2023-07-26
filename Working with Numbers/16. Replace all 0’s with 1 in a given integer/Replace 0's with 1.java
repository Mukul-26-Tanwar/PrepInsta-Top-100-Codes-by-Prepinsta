import java.util.Scanner;
class ZeroToOne
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Helper h = new Helper();
        h.convertZeroToOne(number);
    }
}
class Helper
{
    void convertZeroToOne(int number)
    {
        String str2="";
        String str = Integer.toString(number);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0')
            {
                str2 += '1';
            }
            else
            {
                str2 += str.charAt(i);
            }
        }
        System.out.print(str2);
    }
}