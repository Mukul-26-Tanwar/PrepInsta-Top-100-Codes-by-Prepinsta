import java.util.*;
class Roots
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Helper h = new Helper();
        h.findingRoots(a,b,c);
        //System.out.print(n);    
    }
}
class Helper
{
    void findingRoots(int a,int b, int c)
    {
        int determinant = (b*b) -(4*a*c);
        if(determinant>0)
        {
            System.out.print((-b+Math.sqrt(determinant))/2*a+" and the 2nd is ");
            System.out.print((-b-Math.sqrt(determinant))/2*a);
        }
        else if(determinant==0)
        {
            System.out.print((-b+Math.sqrt(determinant))/2*a);
        }
        else    System.out.print("No Roots");
    }
}
