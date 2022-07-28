import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=4;
      for(int i=0;i<n;i++)
      {
    	  for(int j=0;j<n;j++)
    	  {
    		  if(i==0)
    		   System.out.print(" 1");
    		  else if(i==n-3)
    			  System.out.print(" 2");
    		  else if(i==n-2)
    			  System.out.print(" 3");
    		  else if(i==n-1)
    			  System.out.print(" 4");
    		  else
    			  System.out.print(" ");
    	  
      }
    	  System.out.println();
	}
	}
}
