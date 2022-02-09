package Phaseoneprojects;

import java.util.Scanner;

public class arithcal {
	 public static void main(String[] args)
	   {
	      float a, b, res;
	      int choice;
	      
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("\nEnter any First Number: ");
	      a = sc.nextFloat();
	      System.out.print("\nEnter any second Number: ");
	      b = sc.nextFloat();
	      
	      System.out.println("1. Addition");
	      System.out.println("2. Subtraction");
	      System.out.println("3. Multiplication");
	      System.out.println("4. Division");
	      System.out.print("Enter Your Choice (1-4): ");
	      choice = sc.nextInt();
	     
	       if(choice==1)
	            res = a+b;
	       else if(choice==2)
	            res = a-b;
	       else if(choice==3)
	            res = a*b;
	       else
	            res = a/b;
	         
	         System.out.println("\nResult = " +res);
	    } 
	
}