import java.util.*;
class sum
{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("URK23CO2032");
        int temp=1,i,j;
        for(i=1;i<=4;i++)
	{
            for(j=i;j>=1;j--)
	    {
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
    }
}

