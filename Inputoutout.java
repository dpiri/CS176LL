import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Inputoutout {
	
	   public static void main(String[] args) throws FileNotFoundException
	   {
		  boolean fileFound = false;
		   
		  while (fileFound == false)
		  {
			  
		  try
		  {
		  Scanner file = new Scanner(System.in);
		  
		  System.out.println("Please enter the path to open the input file for example C:\\\\Downloads\\\\lines.txt : ");
		  
		  String fileName = file.next();
		 
		  fileFound = true;
	 
	      File inputFile = new File(fileName);
	      
	      PrintWriter outputFile = new PrintWriter("Output.txt");
	    	  
	      Scanner in = new Scanner(inputFile);
	      
	      while (in.hasNext()) 
	      {
	      String what =in.next();
	      
	      System.out.println(what);
	      
	      outputFile.println(what);
	      }
		  
	      in.close();
	      
	      outputFile.close();
	      
	      file.close();
		  }
		  catch (FileNotFoundException exception)
		  {
			  System.out.println("File is not found, please try again");
			  
			  fileFound = false;
		  }
		  }
	   
	}
	}

