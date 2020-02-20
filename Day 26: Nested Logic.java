import java.io.*;
import java.util.*;
public class Solution 
{
    public static void main(String[] args) 
    {
        int d,m,y,fine;
        int ad,am,ay;
        Scanner s = new Scanner(System.in);
        d=s.nextInt();
        m=s.nextInt();
        y=s.nextInt();
        ad=s.nextInt();
        am=s.nextInt();
        ay=s.nextInt();
        if(y>ay)fine = 10000;
        else if (m>am&&y==ay)fine = 500*(m-am);
        else if (d>ad&&m==am&&y==ay)fine = 15*(d-ad);
        else fine = 0;
       
        System.out.println(fine);
        
    }
}

