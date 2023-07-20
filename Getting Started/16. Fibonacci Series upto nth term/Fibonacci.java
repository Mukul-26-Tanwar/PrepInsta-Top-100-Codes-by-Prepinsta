import java.util.Scanner;

class Fibonacci
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Helper h = new Helper();
        h.ans(n);

        System.out.println();

        System.out.print(0+" "+1+" ");
        h.recursion(n,0,1,0);

        int[] arr = new int[n];
        arr[0]=0;   arr[1]=1;
        h.array(arr,n);
    }
}
class Helper
{
    void ans(int n)//Method 1
    {
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++)
        {
            int next =a+b;
            a=b;
            b=next;
            System.out.print(b+" ");
        }
    }
    void recursion(int n,int a,int b,int next)//Method 2
    {
        if(n==2)    return;
        next=a+b;
        a=b;
        b=next;
        System.out.print(b+" ");
        recursion(n-1,a,b,next);


    }
    void array(int[] arr,int n)//Method 3
    {
        for(int i=2;i<n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}