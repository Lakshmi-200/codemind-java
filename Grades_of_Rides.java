import java.util.*;
class Grades
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int h=s.nextInt();
        int p=s.nextInt();
        int e=s.nextInt();
        if(h>50&&p>60&&e>100)
        {
            System.out.println(10);
        }
        else if(h>50&&p>60&&e<=100)
        {
            System.out.println(9);
        }
        else if(p>60&&h<=60&&e>100)
        {
            System.out.println(8);
        }
        else if(h>50&&p<=60&&e>100)
        {
            System.out.println(7); 
        }
        else if(h>50||p>60||e>100)
        {
            System.out.println(6);
        }
        else
        {
            System.out.println(5);
        }
    }
}