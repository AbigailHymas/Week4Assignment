// Code reviewed by @professorgordon
//Abigail Hymas
import java.util.Scanner;

public class Week4Assignment {

	public static void main(String[] args) {
	
	double roomLength;
	double roomWidth;
	double roomHeight;
	Scanner input = new Scanner(System.in);
	System.out.println("This program will accept a length, width and height of a box");
	System.out.println("and then it will report the surface area and volume of it.\n");
	System.out.print("\tEnter the box Length: ");
	roomLength = input.nextDouble();
	System.out.print("\tEnter the box Width: ");
	roomWidth = input.nextDouble();
	System.out.print("\tEnter the box Height: ");
	roomHeight = input.nextDouble();
	calculateSurfaceArea(roomLength, roomWidth, roomHeight);
	calculateVolume(roomLength, roomWidth, roomHeight);
	input.close();
	
	}

	private static double calculateSurfaceArea(double roomLength, double roomWidth, double roomHeight) {
		double Area = 2*roomLength*roomWidth + 2*roomWidth*roomHeight + 2*roomLength*roomHeight;
		System.out.println(); 
		System.out.printf("The Surface Area of the rectangle is: %,.2f", Area);
		return Area;
		
	}

	private static double calculateVolume(double roomLength, double roomWidth, double roomHeight) {
		double Volume = roomLength * roomHeight * roomWidth;
		System.out.println();
		System.out.printf("The Volume of the Rectangle is: %,.2f", Volume);
		return Volume; 
	}

}
