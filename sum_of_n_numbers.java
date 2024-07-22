import java.util.*;
class sum
{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("URK23CO2032");
        System.out.println("Enter a number:");
        int n=sc.nextInt(), sum=0;
        for(int i=1;i<=n;i++)
            sum+=i;
        System.out.println("The sum of "+n+" numbers is "+sum);
    }
}

