import java.util.Scanner;

public class Collatz_Sequence_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        seq(number);
    }
    public static void seq(int number)
    {
        if(number==1)
        {
            System.out.print(1+" ");
            return;
        }
        System.out.print(number+" ");
        while(number!=1)
        {
            if(number%2==0)
            {
                number/=2;
                System.out.print(number+" ");
            }
            else {
                number=3*number+1;
                System.out.print(number+" ");
            }
        }
        return;
    }
}
