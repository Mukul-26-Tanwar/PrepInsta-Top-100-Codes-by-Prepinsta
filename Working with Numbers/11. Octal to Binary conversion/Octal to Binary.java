import java.util.Scanner;
class OctalToBinary
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int octal = sc.nextInt();
        Helper h = new Helper();
        int decimal = h.convertToDecimal(octal);
        int[] binary =new int[20];
        h.convertToBinary(binary,decimal);
        for(int i=binary.length-1;i>=0;i--)
        {
            System.out.print(binary[i]+"");
        }

    }
}
class Helper
{
    int convertToDecimal(int octal)
    {
        int decimal=0;
        int i=0;
        while(octal>0)
        {
            int temp=octal%10;
            decimal += temp*Math.pow(8,i);
            octal /=10;
            i++;
        }
        return decimal;
    }
    int[] convertToBinary(int[] binary,int decimal)
    {
        int i=0;
        while(decimal>0)
        {
            binary[i++]=decimal%2;
            decimal /=2; 
        }
        return binary;
    }
}