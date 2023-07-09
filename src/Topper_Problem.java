import java.util.Scanner;

public class Topper_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean result=salary(number);
        System.out.println(result);
    }
    public static boolean salary(int number)
    {
        int odd=0,even=0;
        while(number>0)
        {
            int x=number%10;
            if(x%2==0)
                even+=x;
            else odd+=x;
            number/=10;
        }
        if(odd==even)
            return true;
        return false;
    }
}
