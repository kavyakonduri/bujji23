/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int low=153,high=371;
        for(int number=low+1;number<high;++number)
        {
           int digits=0;
           int result=0;
           int originalnumber=number;
           while(originalnumber!=0)
           {
             originalnumber /=10;
             ++digits;
           }
          originalnumber=number;
          while(originalnumber!=0)
          {
             int remainder=originalnumber%10;
             result +=math.pow(remainder,digits);
             originalnumber /=10;
          }
         if(result==number)
            System.out.println(number+" ");
	}
}
}
