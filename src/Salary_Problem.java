import java.util.Scanner;

public class Salary_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sun=sc.nextInt();
        int mon=sc.nextInt();
        int tue=sc.nextInt();
        int wed=sc.nextInt();
        int thurs=sc.nextInt();
        int fri=sc.nextInt();
        int sat =sc.nextInt();

        int week[]={sun,mon,tue,wed,thurs,fri,sat};
        int basesal=100;
        int extra8=15;
        int extra40=25;
        int sunbon=50;
        int satbon=25;

        int totalsal=0,totalhours=0;
        for(int i=0;i<7;i++)
        {
            if(i!=0 && i!=6){
            totalsal+=week[i]*basesal;}
            totalhours+=week[i];
            if(week[i]>8)
            {
                totalsal+=(week[i]-8)*extra8;
            }
            if(i==0)//sunday
            {
                totalsal+=week[i]*basesal;
                totalsal+=(week[i]*basesal*sunbon)/100;
            }
            if(i==6)//saturday
            {
                totalsal+=week[i]*basesal;
                totalsal+=(week[i]*basesal*satbon)/100;
            }
        }
        if(totalhours>40)
        {
            totalsal+=(totalhours-40)*extra40;
            totalsal-=(week[0]*sunbon)/100;
            totalsal-=(week[6]*satbon)/100;
        }
        System.out.println(totalsal);


    }
}
