/**
 * This is a part of lab two. It is designed to show impercisions in 
 * Java's multiplication.
 * @author Nick Williams, twilliams027@student.sdccd.edu
 * @version 1.2
 * @since 14Feb2025
 */

public class JavaImpercisionTestLab2
{
     public static void main (String [] args)
    {
      double x, y, z;
      double dif; //Use for your z - 1 
      
      x = 1.23456789E204;
      y = 1/x;
      z = (x*y); 
      dif = 1-z;
      
      System.out.println("the value of x is: " + x);
      System.out.println("the value of y is: " + y);
      System.out.println("the value of z (x*y) is: " + z);
      System.out.println("the value of 1 - z is: "+ dif);
        
    }
}



