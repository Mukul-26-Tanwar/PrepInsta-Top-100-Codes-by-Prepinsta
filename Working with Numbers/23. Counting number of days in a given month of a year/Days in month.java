import java.util.*;
class CountDays
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        Helper h = new Helper();
        h.countOfDays(month,year);
        //System.out.print(n);    
    }
}
class Helper
{
    void countOfDays(int month,int year)
    {
        if((month==2) && ((year%4==0) || ((year%100==0)&&(year%400==0))))
            System.out.println("Number of days is 29");

        else if(month==2)
            System.out.println("Number of days is 28");

        else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            System.out.println("Number of days is 31");

        else
            System.out.println("Number of days is 30");
    }
}
