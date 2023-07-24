import java.util.Scanner;
class HexadecimalToDecimal
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexadecimal = sc.nextLine();
        //int num2 = sc.nextInt();
        Helper h = new Helper(); 
        int n = h.convert(hexadecimal);
        System.out.print(n);
    }
}
class Helper
{
    int convert(String hex)
    {  
        String digits = "0123456789ABCDEF";  
        hex = hex.toUpperCase();  
        int val = 0;  
        for (int i = 0; i < hex.length(); i++)  
        {  
            char c = hex.charAt(i);  
            int d = digits.indexOf(c);  
            val = 16*val + d;  
        }  
        return val;
    }  
}