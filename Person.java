package ObjClassTut.ObjClassTut;
import java.util.Scanner;


public class Person 
{
	
	static Scanner kboard = new Scanner (System.in);
	
	private String forename;
	private String surname;
	private String email;
	private String mobile;
	private int age;
	
	public Person() // non-argument constructor 
	{	
		this.getForename();
		this.getSurname();
		this.getEmail();
		this.getAge();
		this.getMobile();
	}
	
	public void displayPerson() // method to display all information gathered
	{
		System.out.println("Name = " + forename + "" + surname);
		System.out.println("Email Address = " + email);
		System.out.println("Age = " + age);
		System.out.println("Mobile Number = " + mobile);
	}
	
	public void getForename() // method to get users forename input
	{
		System.out.println("Please enter your forename ");
		forename = kboard.nextLine();
	}
	
	public void getSurname() // method to get users surname input
	{
		System.out.println("Please enter your surname ");
		surname = kboard.nextLine();
	}
	
	public void getEmail() // method to get users email address input
	{
		System.out.println("Please enter your Email address ");
		email = kboard.nextLine();
	}
	
	private void getAge() // method to get users age input
	{
		System.out.println("Please enter your Age ");
		age = kboard.nextInt();
		
		while (checkAge(age)!=true)
		{
			System.out.println("You are below 18, try again");
			System.out.println("Please re-enter your Age ");
			age = kboard.nextInt();
		}
	}
	
	public void getMobile() // method to get users mobile input
	{	
		System.out.println("Please enter your Mobile Number ");
		mobile = kboard.next();
	}
	
	private boolean checkAge(int age) // to check if user is over 18
	{
		boolean OK = true;
				
		if (age < 18)
		{
			OK = false;
		}
		if (age >= 18)
		{
			OK = true;
		}
		return(OK);
	}
}
