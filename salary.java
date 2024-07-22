import java.util.*;
class sum
{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("URK23CO2032");
        System.out.println("Enter the basic salary:");
        int bs=sc.nextInt();
        double gs=(bs<=10000)?(bs*0.2+bs*0.8):(bs<=20000)?(bs*0.25+bs*0.9):(bs*0.3+bs*0.95);
        gs+=bs;
        System.out.println("The gross salary is "+gs);
    }
}

