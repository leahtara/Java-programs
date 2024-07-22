import java.util.*;
class subscription 
{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        int i=0,p=0;
        while(i==0)
        {
            System.out.println("Select:\n1. Select a plan\n2. Pay\n3. Exit");
            int s=sc.nextInt();
            switch(s)
            {
                case 1:
                    System.out.println("Select: \n1. Basics plan (Rs.499)\n2. Kids plan (Rs.699)\n3. Sports plan (Rs.1199)\n4. English plan (Rs.799)");
                    p=sc.nextInt();
                    break;
                case 2:
                    String t=(p==1)?"499":(p==2)?"699":(p==3)?"1199":(p==4)?"799":"No plan selected";
                    System.out.println("Your total: "+t);
                    break;
                case 3:
                    System.exit(0);
                default:
                    continue;
            }
            
        }
    }
}
