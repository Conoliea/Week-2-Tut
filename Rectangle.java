package ObjClassTut.ObjClassTut;

import java.util.Scanner;

public class Rectangle 
{
	static Scanner kboard = new Scanner (System.in);
	
	
	private int height;
	private int width;
	
	public Rectangle()
	{
		this.getHeight();
		this.getWidth();
		this.calculateArea(height, width);
		this.isSquare();
	}
	

	public void displayShapeValue() // method to display all information gathered
	{
		System.out.println("Height = " + height);
		System.out.println("Width = " + width);
		System.out.println("Area = " + calculateArea(height, width));
	}
	
	public void getHeight()
	{
		System.out.println("Please enter the height: ");
		height = kboard.nextInt();
	}
	
	public void getWidth()
	{
		System.out.println("Please enter the width ");
		width = kboard.nextInt();
	}
	
	public void isSquare()
	{
		if (checkShape(height, width)!=true)
		{
			System.out.println("Shape is a rectangle");
		}
		else
		{
			System.out.println("Shape is a square");
		}
	}

	private boolean checkShape(int height, int width) // to check if height = width
	{
		boolean OK = true;
				
		if (height != width)
		{
			OK = false;
		}
		if (height == width)
		{
			OK = true;
		}
		return(OK);
	}
	
	public int calculateArea(int height, int width)
	{
		int area = height*width;
		return(area);
	}
	
	
}

