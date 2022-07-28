import java.util.Scanner;

public class IneuronPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Number For STAR!!!");
  int n=sc.nextInt();
  
  for(int i=0;i<n;i++)
  {
	  //Below loop For Printing I.
	  for(int j=0;j<n;j++)
	  {
		  if(i==0||j==(n-1)/2||i==n-1)
			  System.out.print("*");
		  else
			  System.out.print(" ");
	  }
	 
  
      System.out.print(" ");

      //Below loop For Printing N.
	  for(int j=0;j<n;j++)
	  {
		  if(j==0||i==j||j==n-1)
			  System.out.print("*");
		  else
			  System.out.print(" ");
	  }
	  
	   System.out.print(" ");
 
	   //Below loop For Printing E.
	  for(int j=0;j<n;j++)
	  {
		  if(i==0||j==0||i==(n-1)/2||i==n-1)
			  System.out.print("*");
		  else
			  System.out.print(" ");
	  }
	  System.out.print(" ");

	  //Below loop For Printing U.
	  for(int j=0;j<n;j++)
	  {
		  if(j==0||j==n-1||i==n-1)
			  System.out.print("*");
		  else
			  System.out.print(" ");
	  }
	  System.out.print(" ");
	  
	  //Below loop For Printing R.
	  for(int j=0;j<n;j++)
	  {
		  //int k=1;
		 /* if ((i == 0 || i == (n-1)/2)
	                && j < (n - 2))
	                System.out.printf("*");
	            else if (j == (n - 2)
	                    && !(i == 0 || i == (n-1)/2))*/
		   if(i==0||j==0||i==(n-1)/2||(j==(n-1) && i<=(n-1)/2)||i-j==(n-1)/2)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	  }
      System.out.print(" ");
	  
	  //Below loop For Printing O.
	  for(int j=0;j<n;j++)
	  {
		  if (i==0||j==0||i==n-1||j==n-1)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	  }
	  System.out.print(" ");

      //Below loop For Printing N.
	  for(int j=0;j<n;j++)
	  {
		  if(j==0||i==j||j==n-1)
			  System.out.print("*");
		  else
			  System.out.print(" ");
	  }
	  
	  System.out.println();
	  
  }
  }

  
	}
	


