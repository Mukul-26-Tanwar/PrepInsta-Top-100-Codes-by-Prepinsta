import java.util.Scanner;
class BinaryToOctal
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        //int num2 = sc.nextInt();
        Helper h = new Helper(); 
        
        int decimal = h.convertToDecimal(binary);
        System.out.println(decimal);

        int[] octal = new int[20];
        octal=h.convertToOctal(octal,decimal);
        for(int i=octal.length-1;i>=0;i--)
        {
            System.out.print(octal[i]+"");
        }
    }
}
class Helper
{
    int convertToDecimal(int binary)
    {
        int decimal=0;
        int i=0;
        while(binary>0)
        {
            int temp = binary%10;
            decimal += temp*Math.pow(2,i);
            binary /=10;
            i++;
        }
        return decimal;
    }
    int[] convertToOctal(int[] octal,int decimal)
    {
        int i=0;
        while(decimal>0)
        {
            octal[i++]=decimal%8;
            decimal /= 8;
        }
        return octal;
    }
}