import java.util.Scanner;
class CoordinatesOnGraph
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Helper h = new Helper();

        int x=sc.nextInt();         int y = sc.nextInt();

        h.plotTheCoordinates(x,y);
    }
}
class Helper
{
    void plotTheCoordinates(int x,int y)
    {
        if(x>0 && y>0)          System.out.print("Quadrant - 1");
        else if(x<0 && y>0)     System.out.print("Quadrant - 2");
        else if(x<0 && y<0)     System.out.print("Quadrant - 3");
        else if(x>0 && y<0)     System.out.print("Quadrant - 4");
        else if(x==0 && y==0)   System.out.print("Origin");
        else if(x!=0 && y==0)   System.out.print("X-axis");
        else if(x==0 && y!=0)   System.out.print("Y-axis");
    }
}
