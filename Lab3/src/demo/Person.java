package demo;

/**
 * @author jaime nunez
 * @version 1.0
 * CS 2003 Lab 3
 * Student ID 1451353
 * Due 9/14/17
 */

//The person blueprint
public class Person {

	//This is a static variable. Not an instance variable
	static int currentYear = 2017;
	//Instance variables of Person class
	private String name;
	private int birthDate;
	private int age;
	
	//constructor
	//allows us to pass in the name and birthday to an instance of a person being created
	public Person(String name, int bdate){
		this.name = name;
		this.birthDate = bdate;
	}
	
	//Encapsulation of the way to access the persons information inside one method. 
	public void showPersonInfo(){
		display_name();
		display_birthday();
		display_age();
		
	}
	
	//below are the instance methods which act on the instance variables
	
	//Never used in the main method, but could be useful if we need to change the birthday for whatever reason
	public void reset_birthday(int year){
		birthDate = year;
	}

	//method that prints out the name of the instance 
	public void display_name(){
		System.out.println("This is " + name);
	}
	
	//method that prints out the birthday of the instance 
	public void display_birthday(){
		System.out.printf("I was born in %d. ",birthDate);
	}
	
	//method that prints out the age of the instance 
	public void display_age(){
		age = currentYear - birthDate;
		System.out.printf("I am %d years old ",age);
		isSeniorCitizen();
	}


	//determines if instance is a senior citizen or not. Will print result
	private void isSeniorCitizen() {
		if (age >= 65){
			System.out.println("\nI'm a senior citizen");
		}
		else{
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is were we instantiate a person John
		Person John = new Person("John",1957);
		//Access Johns instance method's and show his personal info
		John.showPersonInfo();

		
		
	}

}