import java.util.*;
class Average
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double n=s.nextDouble();
        double m=s.nextDouble();
        double sum=n+m;
        double aver=sum/2;
        System.out.printf(String.format("%.4f",aver));
    }
}