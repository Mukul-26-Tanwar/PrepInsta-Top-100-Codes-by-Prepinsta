import java.util.Scanner;
class Handshakes
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Helper h = new Helper();

        int numOfPeople=sc.nextInt();
        int ans = h.numOfHandshakes(numOfPeople);
        System.out.print(ans);
    }
}
class Helper
{
    int numOfHandshakes(int people)
    {
        return (people*(people-1))/2;
    }
}