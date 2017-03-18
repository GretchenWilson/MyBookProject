//********************************************************************************
// Gretchen Wilson
// CMSC 256 Fall 2016
// MyBookTester.java
//
// Program tests the methods of the class MyBook.
// MyBook creates objects that represent books that can 
// be compared by ISBN10 or ISBN13.
//********************************************************************************

import java.io.*;
import java.util.*;
public class MyBookTester {
	
	  private static void printHeading() 
	  { 
	  String name = "\nGretchen Wilson";
	  System.out.println(name);
	  System.out.println("CSC 256 Fall 2016");
	  System.out.println("Programming Project 1");
	  System.out.println(); 
	  }

	public static void main(String[] args) {
		printHeading();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//Testing default constructor 
		System.out.println("Testing default constructor. Default parameters should be printed for all parameters.");
		MyBook defaultBook = new MyBook();
		System.out.println(defaultBook.toString() + "\n");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//Testing parameterized constructor
		System.out.println("Testing parameterized constructors. Parameters of mistBook should be printed.");
		MyBook mistBook = new MyBook("Mistborn", "Brian", "Sanderson", "1119573856", "2341119573856");
		System.out.print(mistBook.toString() + "\n");
		
		try{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			//Testing setTitle()
			System.out.println("Checking setTitle(). Parameter should be set without error.");
			defaultBook.setTitle("Harry Potter and the Sorcerer's Stone.");
			//Testing getTitle()
			System.out.println("Checking getTitle(). \"Harry Potter and the Sorcerer's Stone\" should be printed.");
			System.out.println("Results: " + defaultBook.getTitle());
			//Testing setTitle() with a null parameter
			System.out.println("Checking setTitle() with null parameter. IllegalArgumentException message should be shown.");
			defaultBook.setTitle(null);	
		}
		catch(IllegalArgumentException N){
			System.out.println("\t**********" + N.getMessage() + "***********");
		}
		try{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			//Testing setAuthorFirstName()
			System.out.println("Checking setAuthorFirstName(). Parameter should be set without error.");
			defaultBook.setAuthorFirstName("J.K.");
			//Testing setAuthorFirstName()
			System.out.println("Checking getAuthorFirstName(). \"J.K.\" should be printed.");
			System.out.println("Results: " + defaultBook.getAuthorFirstName());
			//Testing setAuthorFirstName() with a null parameter
			System.out.println("Checking setAuthorFirstName() with null parameter. IllegalArgumentException message should be shown.");
			defaultBook.setAuthorFirstName(null);
			}
		catch(IllegalArgumentException I){
				System.out.println("\t**********" + I.getMessage() + "***********");
		}
		try{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			//Testing setAuthorLastName()
			System.out.println("Checking setAuthorLastName(). Parameter should be set without error.");
			defaultBook.setAuthorLastName("Rowling");
			//Testing setAuthorLastName()
			System.out.println("Checking getAuthorlastName(). \"Rowling\" should be printed.");
			System.out.println("Results: " + defaultBook.getAuthorLastName());
			//Testing setAuthorLastName() with a null parameter
			System.out.println("Checking setAuthorLastName() with null parameter. IllegalArgumentException message should be shown.");
			defaultBook.setAuthorLastName(null);
			}
		catch(IllegalArgumentException I){
				System.out.println("\t**********" + I.getMessage() + "***********");
		}
		try{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			//Testing setIsbn10()
			System.out.println("Checking setIsbn10(): Parameter should be set without error.");
			defaultBook.setIsbn10("0094857301");
			//Testing setIsbn10()
			System.out.println("Checking getIsbn10(): \"0094857301\" should be printed.");
			System.out.println("\tResults: " + defaultBook.getIsbn10());
			//Testing setIsbn10() with a null parameter
			System.out.println("Checking setIsbn10() with null parameter. IllegalArgumentException message should be shown.");
			defaultBook.setIsbn10(null);
			}
		catch(IllegalArgumentException I){
				System.out.println("\t**********" + I.getMessage() + "***********");
		}
		try{
			//Testing setIsbn10() with an invalid isbn10.
			System.out.println("Checking setIsbn10() with an invalid parameter. IllegalArgumentException message should be shown.");
			defaultBook.setIsbn10("L094857300");
		}
		catch (IllegalArgumentException E){
			System.out.println("\t**********" + E.getMessage() + "**********");
			
		}
		try{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			//Testing setIsbn13()
			System.out.println("Checking setIsbn13(): Parameter should be set without error.");
			defaultBook.setIsbn13("1110094857301");
			//Testing setIsbn13()
			System.out.println("Checking getIsbn13(): \"1110094857301\" should be printed.");
			System.out.println("\tResults: " + defaultBook.getIsbn13());
			//Testing setIsbn13() with a null parameter
			System.out.println("Checking setIsbn13() with null parameter. IllegalArgumentException message should be shown.");
			defaultBook.setIsbn13(null);
			}
		catch(IllegalArgumentException I){
				System.out.println("\t**********" + I.getMessage() + "***********");
		}
		try{
			//Testing setIsbn13() with an invalid isbn10.
			System.out.println("Checking setIsbn13() with an invalid parameter. IllegalArgumentException message should be shown.");
			defaultBook.setIsbn13("11100948T3011");
		}
		catch (IllegalArgumentException E){
			System.out.println("\t**********" + E.getMessage() + "**********");
		}
		
		//Use parameterized constructor to initialized more MyBook objects 
		MyBook endersBook = new MyBook("Ender's Game", "Orson Scott", "Card","0446310786", "6750446310786");
		MyBook americanBook = new MyBook("American Gods", "Neil", "Gaiman", "2637465736", "3342637465736");
		MyBook potterBook = new MyBook("Harry Potter and the Sorcerer's Stone", "J.K", "Rowling", "2301045812", "4342301045812");
		
		
		//Test equals() between endersBook and String object
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		String notBook = "I am not a book";
		Scanner in = new Scanner("string");
		int number = 77;
		Boolean question = true;		
		System.out.println("Checking equals() with MyBook object and non-MyBook object. Test should return false.");
		System.out.println("\tResults: " + (endersBook).equals(notBook));
		System.out.println("\tResults: " + (endersBook).equals(in));
		System.out.println("\tResults: " + (endersBook).equals(number));
		System.out.println("\tResults: " + (endersBook).equals(question));
		
		
		//Test equals between endersBook and itself
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Reflexive: Checking equals with MyBook object and itself. Tests should return true.");
		System.out.println("\tResults: " + endersBook.equals(endersBook));
		System.out.println("\tResults: " + americanBook.equals(americanBook));
		System.out.println("\tResults: " + mistBook.equals(mistBook));
		System.out.println("\tResults: " + potterBook.equals(potterBook));
		//Test equals between endersBook and americanBook. Two separate MyBook objects.
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Symmetric: Checking equals with two different MyBook objects(endersBook, americanBook) Test should return false.");
		System.out.println("\tResults: " + endersBook.equals(americanBook));
		System.out.println("\tResults: " + americanBook.equals(mistBook));
		System.out.println("\tResults: " + mistBook.equals(potterBook));
		System.out.println("\tResults: " + potterBook.equals(endersBook));
		
		//Test equals between three like MyBook objects
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		MyBook endersBook2 = new MyBook("Ender's Game", "Orson Scott", "Card","0446310786", "6750446310786");
		MyBook endersBook3 = new MyBook("Ender's Game", "Orson Scott", "Card","0446310786", "6750446310786");
		MyBook endersBook4 = new MyBook("Ender's Game", "Orson Scott", "Card","0446310786", "6750446310786");
		System.out.println("Transitive: Checking equals with different MyBook objects of same values. Tests should return true.");
		System.out.println("\tResults: " + endersBook.equals(endersBook2));
		System.out.println("\tResults: " + endersBook2.equals(endersBook3));
		System.out.println("\tResults: " + endersBook3.equals(endersBook4));
		System.out.println("\tResults: " + endersBook4.equals(endersBook));
		//Test equals between MyBook objects for equality multiple times
		System.out.println("Symmetric: Checking equals with two different MyBook objects(endersBook, americanBook) Tests should return false.");
		System.out.println("\tResults: " + endersBook.equals(americanBook));
		System.out.println("\tResults: " + americanBook.equals(endersBook));
		System.out.println("\tResults: " + endersBook.equals(americanBook));
		System.out.println("\tResults: " + americanBook.equals(endersBook));
	}

}
