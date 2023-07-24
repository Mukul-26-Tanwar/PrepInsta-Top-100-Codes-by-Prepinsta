import java.util.Scanner;
class DecimalToHexadecimal
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        //int num2 = sc.nextInt();
        char[] hexadecimal = new char[20];
        Helper h = new Helper(); 
        hexadecimal = h.convert(hexadecimal,decimal);
        for(int j = hexadecimal.length-1 ; j >= 0 ; j--)
		System.out.print(hexadecimal[j]+"");
    }
}
class Helper
{
    char[] convert(char[] hexadecimal,int decimal)
    {
        int i = 0;
        while (decimal != 0)
        {
            int rem = decimal%16;
            // check if rem < 10 : Digits : 0 - 9
            // ascii 0 : 48
            if (rem < 10)
            {
                hexadecimal[i] = (char) (rem + 48);
                i++;
            }                    
            // else positional values : A - F 
            // rem value will be > 10, adding 55 will result : A - F 
            // ascii A : 65, B : 66 ..... F : 70 
            else
            {
                hexadecimal[i] = (char) (rem + 55);
                i++;
            } 
            decimal /= 16;
        } 
        return hexadecimal;
    }
}