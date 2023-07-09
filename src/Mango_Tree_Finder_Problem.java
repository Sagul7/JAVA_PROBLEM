import java.util.Scanner;

public class Mango_Tree_Finder_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int treeno=sc.nextInt();

        boolean result=mango(row,column,treeno);
        System.out.println(result);
    }
    public static boolean mango(int row,int column,int treeno)
    {
        if(treeno<=column || (treeno%column==1) || treeno%column==0)
            return true;
        return false;
    }
}
