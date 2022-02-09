package Phaseoneprojects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class FileHandling {
	 static int a;
     static int b;
     static int c;
     static int res=0;
     void calculator() throws IOException {  
	     while(true) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("enter the first number ");
	      a=sc.nextInt();
	      System.out.println("enter the second number ");
	      b=sc.nextInt();
	      System.out.println("1. Addition");
	      System.out.println("2. Subtraction");
	      System.out.println("3. Multiplication");
	      System.out.println("4. Division");
	      System.out.print("Enter Your Choice (1-4): ");
	      System.out.println("enter the choice number ");
	      c=sc.nextInt();       
	       if(c==1)
	            res = a+b;
	       else if(c==2)
	            res = a-b;
	       else if(c==3)
	            res = a*b;
	       else if(c==4)
	            res = a/b;
	       else
	    	   System.out.println("choice is incorrect");
	       
	         System.out.println("\nResult = " +res);
	     
 
	      File file = new File("D:\\file\\siva.txt");
	      
	      if(file.createNewFile()) {
	    	  System.out.println("File is created");
	      }
	      else {
	    	  System.out.println("File is already exist");
	      }

	      FileWriter writer =new FileWriter(file);
	      writer.append("First number ="+a+"\nSecond number ="+b+"\nthe choice is "+c+"\nresult is "+res);
	      writer.close();
	      
	      FileInputStream stream = new FileInputStream(file);
	      int data;
	      while((data=stream.read())!=-1) {
	    	  System.out.print((char)data);
	      }
	      System.out.println("");
	      
	     }	     
     }
	 public static void main(String[] args) throws IOException {
			FileHandling f=new FileHandling();
			f.calculator();
	
	 }
}
