import java.util.*;
class Triangle
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double a=s.nextInt();
        double b=s.nextInt();
        double c=s.nextInt();
        double p=(a+b+c)/2;
        double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("%.2f",area);
    }
}