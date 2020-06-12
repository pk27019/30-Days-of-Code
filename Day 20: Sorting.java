import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++)
        {
            a[a_i] = in.nextInt();
        }
        int cnt = 0;boolean bool=false;
        for(int i =1;i<a.length;i++)
          for(int j=0;j<i;j++)  
            if(a[j]>a[i])
              bool = true;
        if(bool==true)
        for(int i =1;i<a.length;i++)
          for(int j=0;j<i;j++)
            if(a[j]>a[i])
            {
               int temp = a[j];
               a[j] = a[i];
               a[i] = temp;cnt++;
            }
        System.out.println("Array is sorted in "+ cnt+  " swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);
    }
}
