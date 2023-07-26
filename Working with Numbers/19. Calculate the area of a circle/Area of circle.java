import java.util.Scanner;
class Area
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int radis = sc.nextInt();
        Circle c = new Circle();
        c.area(radis);    
    }
}
class Circle
{
    void area(int radis)
    {
        System.out.print(3.14*radis*radis);
    }
}