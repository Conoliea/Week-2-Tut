package ObjClassTut.ObjClassTut;
import java.util.Scanner;

public class ShapeProblem {
	
	static Scanner kboard = new Scanner (System.in);
	
	public static void main(String[] args) 
	{
		int choice;
		
		do
		{
			System.out.println("Press 1 for Rectangle, 2 for Circle, 3 to exit: ");
			choice = kboard.nextInt();
		
				if ( choice == 1)
				{
					Rectangle newShapeRectangle = new Rectangle();
					newShapeRectangle.displayShapeValue();
				}
		
				if ( choice == 2)
				{
					Circle newShapeCircle = new Circle();
					newShapeCircle.displayShapeValue();
				}
		}while (choice != 3);
	}
}
