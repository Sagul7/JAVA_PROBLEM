import java.util.*;

public class labAllocation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int L1=sc.nextInt();
        int L2=sc.nextInt();
        int L3=sc.nextInt();
        int n=sc.nextInt();

        int ar[]={L1,L2,L3};
        Arrays.sort(ar);
        int lab=0;
        for(int x:ar)
        {
            if(x>=n)
            {
                lab=x;
                break;
            }
        }
        System.out.println(lab == L1 ? "l1" : (lab == L2 ? "l2" : "l3"));
    }
}
