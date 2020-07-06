package com.project;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import com.fo.impl.*;
import com.model.*;
import com.fo.*;

public class FileMain {


	public static void main(String[] args) throws NullPointerException, IOException {
	 	 
	 int i = 0;
	 int j = 1;
	 String dir1 = null;
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("\n\nWelcome to Virtual Key For Your Repository");
		System.out.println("-------------------------------------------");
		System.out.println("By Dhwani Chetan Khona");
		System.out.println("----------------------");
	 do {
			System.out.println("\nFile Menu");
			System.out.println("-----------");
			System.out.println("1)Sort your Files in ascending order");
			System.out.println("2)File Handling Operations");
			System.out.println("3)close");
			i = Integer.parseInt(scanner.nextLine());

	 switch(i)
	 {
	 case 1:
		 FileBO f =new FileFoImpl();
		 f.sortFile();
		 break;
	 
	 	 case 2:
			 do {
		 System.out.println("\n(1)Add Files in the Directories");
		 System.out.println("\n(2)Delete Directories and Files");
		 System.out.println("\n(3)Search Files");
		 System.out.println("\n(4)Back To Main\n");
		 
		 j = Integer.parseInt(scanner.nextLine());
		 
	 switch(j)
	 {
	 case 1:
     		 Scanner reader1 = new Scanner(System.in);
	        boolean success1 = false;

	        System.out.println("Enter path of directory or create a new directory by providing path and directory name");
	        dir1 = reader1.nextLine();

	        // Creating new directory in Java, if it doesn't exists
	        File directory = new File(dir1);
	        if (directory.exists()) {
	            System.out.println("Directory already exists ...");

	        } else {
	            System.out.println("Directory not exists, creating now");

	            success1 = directory.mkdir();
	            if (success1) {
	                System.out.printf("Successfully created new directory : %s%n", dir1);
	            } else {
	                System.out.printf("Failed to create new directory: %s%n", dir1);
	            }
	        }

	        // Creating new file in Java, only if not exists
	        System.out.println("Enter file name to be created ");
	        String filename = reader1.nextLine();

	        File f5 = new File(dir1,filename);
	        if (f5.exists()) {
	            System.out.println("File already exists");

	        } else {
	            System.out.println("No such file exists, creating now");
	            try {
					success1 = f5.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            if (success1) {
	                System.out.printf("Successfully created new file: %s%n", f5);
	            } else {
	                System.out.printf("Failed to create new file: %s%n", f5);
	            }
	        }
	 break;   
	 case 2:
			 Scanner reader2 = new Scanner(System.in);
		 try  
	       { 
			 System.out.println("Enter the Directory Path"); 
			 String dir4 = reader2.nextLine(); 
			 System.out.println("Enter file name to be deleted ");
		        String file = reader2.nextLine();

		        File f3 = new File(dir4,file);
		        if (f3.delete()) {
		            System.out.println("FILE DELETED SUCCESSFULLY");

		        }
		        else 
		        {
		            System.out.println("No such file exists");
		        }
	       }
	       catch(Exception e)  
	       {  
	       e.printStackTrace();  
	       }  
		
		 break;
		 
	 case 3:
			 Scanner reader3 = new Scanner(System.in);
			 System.out.println("Enter the Directory Path"); 
			 String dir4 = reader3.nextLine(); 
			 System.out.println("Enter file name to be searched");
			String name = reader3.nextLine(); 
				File f4 = new File(dir4,name);
				boolean exist=f4.exists();
				if (f4.exists()){
			      System.out.println("FILE EXISTS!");
			    }
				else{
					System.out.print("FILE DOES NOT EXISTS");
				}
	 
				 break;
	 case 4: 
		
		 break;
	 default:
			 System.out.println("nested default case!!");
			 }
		 } 
	 while(j!=4);
		break;
		 	 
	 case 3:
		 System.out.println("THANK YOU");
			System.exit(0);
			break;
			 
	 default:
	 System.out.println("No matching case found!!");
	 
	
	 }
	 
	 
	 } while (i != 3);
	 
	}

	private static void exit() {
		// TODO Auto-generated method stub
		
	}
}
