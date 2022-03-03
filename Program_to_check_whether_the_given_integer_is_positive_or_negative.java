import java.util.*;
class Posorneg
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n>=0)
        {
            System.out.print("Positive Number");
        }
        else
        {
            System.out.print("Negative Number");
        }
    }
}