import java.util.*;
class Handshakes
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int shakes=(n*(n-1))/2;
        System.out.println(shakes);
    }
}