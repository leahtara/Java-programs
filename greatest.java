import java.util.*;
class largest
{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("URK23CO2032");
        System.out.println("Enter 3 number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int temp=((a>=b)&&(a>=c))?a:((b>=a)&&(b>=c))?b:c;
        System.out.println("The largest number is "+temp);
    }
}

