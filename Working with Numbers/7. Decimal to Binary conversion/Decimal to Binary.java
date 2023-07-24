import java.util.Scanner;
class DecimalToBinary
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        //int num2 = sc.nextInt();
        int[] binary = new int[20];
        Helper h = new Helper(); 
        int[] n = h.convert(binary,decimal);
        for(int j = n.length-1 ; j >= 0 ; j--)
		System.out.print(n[j]+"");
    }
}
class Helper
{
    int[] convert(int[] binary,int decimal)
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