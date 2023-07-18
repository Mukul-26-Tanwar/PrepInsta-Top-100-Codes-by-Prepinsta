import java.util.Scanner;
class LeapYear
{
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    Helper h = new Helper();
        h.ans(year);
}
class Helper
{
    void ans(int year)
    {
        if(year % 400 == 0)                      System.out.println("Yes, "+year+" is a Leap Year");
        else if(year%4==0 && year%100 != 0)      System.out.println("Yes, "+year+" is a Leap Year");
        else                                      System.out.println("No, "+year+" is not a Leap Year");
    }
}