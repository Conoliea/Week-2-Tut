package ObjClassTut.ObjClassTut;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Circle 
{
	DecimalFormat df = new DecimalFormat("#.##");
	static Scanner kboard = new Scanner (System.in);
	
	
	private double radius;
	
	public Circle()
	{
		this.getRadius();
		this.calculateArea( Math.PI * ( 2 * radius));
	}
	

	public void displayShapeValue() // method to display all information gathered
	{
		System.out.println("Radius = " + radius);
		System.out.println("Area = " + calculateArea(Math.PI * ( 2 * radius)));
	}
	
	public void getRadius()
	{
		System.out.println("Please enter the Radius: ");
		radius = kboard.nextInt();
	}
	
	public double calculateArea(double radius)
	{
		double area = Math.PI * ( 2 * radius);
		return(area);
	}
	
	
}

