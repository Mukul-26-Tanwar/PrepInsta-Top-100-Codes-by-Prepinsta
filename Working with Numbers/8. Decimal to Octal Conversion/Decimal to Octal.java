import java.util.Scanner;
class DecimalToOctal
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        //int num2 = sc.nextInt();
        int[] octal = new int[20];
        Helper h = new Helper(); 
        octal = h.convert(octal,decimal);
        for(int j = octal.length-1 ; j >= 0 ; j--)
		System.out.print(octal[j]+"");
    }
}
class Helper
{
    int[] convert(int[] octal,int decimal)
    {
        int i=0;
        while(decimal>0)
        {
            octal[i++]=decimal%8;
            decimal /=8;
        }
        return octal;
    }

}