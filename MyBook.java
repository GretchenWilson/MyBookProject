//********************************************************************************
// Gretchen Wilson
// CMSC 256 Fall 2016
// MyBook.java
//
// MyBook creates objects that represent books that can 
// be compared by ISBN10 or ISBN13
//********************************************************************************


import java.io.*;
import java.util.Scanner;
public class MyBook {
	private String Title;
	private String AuthorFirstName;
	private String AuthorLastName;
	private String Isbn10;
	private String Isbn13;
	
	public MyBook() {
		//Constructor if no parameters are given
		Title = "None Given";
		AuthorFirstName = "None Given";
		AuthorLastName = "None Given";
		Isbn10 = "0000000000";
		Isbn13 = "0000000000000";
	}
	
	public MyBook(String title, String authorFirstName, String authorLastName, String isbn10, String isbn13){
		//Constructor if parameters are specified
		setTitle(title);
		setAuthorFirstName(authorFirstName);
		setAuthorLastName(authorLastName);
		setIsbn10(isbn10);
		setIsbn13(isbn13);
	}
	public String getTitle(){
		return Title;
	}
	
	public void setTitle(String title) throws IllegalArgumentException {
		//sets title variable if parameter is not null
		if (title == null){
			throw new IllegalArgumentException("Variables cannot equal null.");
		}
		Title = title;
	}
	public String getAuthorFirstName(){
		return AuthorFirstName;
	}
	public void setAuthorFirstName(String authorFirstName) throws IllegalArgumentException {
		//sets authorfirstname variable if parameter is not null
		if (authorFirstName== null){
			throw new IllegalArgumentException("Variables cannot equal null.");
		}
		AuthorFirstName = authorFirstName;
	}
	public String getAuthorLastName(){
		return AuthorLastName;
	}
	public void setAuthorLastName(String authorLastName) throws IllegalArgumentException{
		//sets authorlastname variable if parameter is not null
		if (authorLastName == null){
			throw new IllegalArgumentException("Variables cannot equal null.");
		}
		AuthorLastName = authorLastName;
	}
	public String getIsbn10(){
		return Isbn10;
	}
	public void setIsbn10(String isbn10) throws IllegalArgumentException{
		//sets isbn10 variable if parameter is 10 characters in length, not null, and only numbers
		if (isbn10 == null){
			throw new IllegalArgumentException("Variables cannot equal null.");
		}
		if (isbn10.length() > 10 || isbn10.length() < 10){
			//isbn10 shouldnt be less than or greater than 10
			throw new IllegalArgumentException("An ISBN10 must be 10 integers.");
		}
		else if (isbn10.length() == 10){
			//scan through the given isbn to ensure it is all numbers
			Scanner readISBN = new Scanner(isbn10);
			readISBN.useDelimiter("");
			while (readISBN.hasNext()){
				char ch = readISBN.next().charAt(0);
				if (!Character.isDigit(ch)){
					throw new IllegalArgumentException("An ISBN10 must contain only integers.");
				}
				else{continue;}
			}
			readISBN.close();
			Isbn10 = isbn10;
		}
	}
	public String getIsbn13(){
		return Isbn13;
	}
	public void setIsbn13(String isbn13) throws IllegalArgumentException{
		//sets isbn13 variable if parameter is 13 characters in length, not null, and only numbers
		if (isbn13 == null){
			throw new IllegalArgumentException("Variables cannot equal null.");
		}
		if (isbn13.length() < 13 || isbn13.length() > 13){ 
			//isbn13 shouldn't be less than or greater than 13
			throw new IllegalArgumentException("An ISBN13 must be 13 integers.");
		}
		else if (isbn13.length() == 13){
			//scan through the given isbn to ensure it is all numbers
			Scanner readISBN = new Scanner(isbn13);
			readISBN.useDelimiter("");
			while (readISBN.hasNext()){
				char ch = readISBN.next().charAt(0);
				if (!Character.isDigit(ch)){
					throw new IllegalArgumentException("An ISBN13 must contain only integers.");
				}
				else{continue;}
			}
			readISBN.close();
		Isbn13 = isbn13;
				}
	}
	public String toString(){
		//overrides toString method and presents information in an organized fashion
		String output = "Title: " + Title;
		output += "\nAuthor: " + AuthorFirstName + " " + AuthorLastName;
		output += "\nISBN10: " + Isbn10;
		output += "\nISNB13: " + Isbn13;
		return output;
	}
	public boolean equals(Object obj){
		//overrides equals method to test equality by isbn numbers
		if (obj == null){
			return false;
		}
		if (obj == this){
			//is obj this instance of MyBook
			return true;
		}
		if (!(obj instanceof MyBook)){
			return false;
		}
		MyBook otherbook = (MyBook) obj;
		//test equality by matching isbn10 and isbn13
		if (this.getIsbn10().equals(otherbook.getIsbn10()) && this.getIsbn13().equals(otherbook.getIsbn13())){
			return true;
		}
		return false;
	}
	
}
