
import java.util.Scanner;

public class Housepaintingalgo {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
//Define Variables
double lengthOfHouse = 40;
double widthOfHouse = 15;
double heightOfHouse = 25;
double numberOfWindows = 10;
double lengthOfWindow = 4;
double widthOfWindow =  2;
double numberOfDoors = 2;
double lengthOfDoor = 6;
double widthOfDoor = 3;
double costPerSqFt = 5;



//Inputs
System.out.println("Please enter length of house: ");
lengthOfHouse = sc.nextDouble();
System.out.println("Please enter width of house: ");
widthOfHouse = sc.nextDouble();
System.out.println("Please enter height of house: ");
heightOfHouse = sc.nextDouble();
System.out.println("Please enter number of windows: ");
numberOfWindows = sc.nextDouble();
System.out.println("Please enter main length of each window: ");
lengthOfWindow = sc.nextDouble();
System.out.println("Please enter main width of each window: ");
widthOfWindow  = sc.nextDouble();
System.out.println("Please enter number of doors: ");
numberOfDoors = sc.nextDouble();
System.out.println("Please enter main length of each door: ");
lengthOfDoor = sc.nextDouble();
System.out.println("Please enter main width of each door: ");
widthOfDoor = sc.nextDouble();
System.out.println("Please enter cost per square foot: ");
costPerSqFt = sc.nextDouble();
//Calculations

double sqftPeak = (lengthOfHouse * widthOfHouse) + 0.5 * (lengthOfHouse * (heightOfHouse-widthOfHouse));
   double sqftNormal = lengthOfHouse * widthOfHouse;
   double totalSurfaceArea = 2 * sqftPeak + 2 * sqftNormal;
   double totalSurfaceAreaFinal = totalSurfaceArea - ((numberOfWindows * widthOfWindow * lengthOfWindow) + (numberOfDoors * lengthOfDoor * widthOfDoor));
double estimate = totalSurfaceAreaFinal * costPerSqFt;

//deduct total window and door surface area from total surface area, then find estimate normally




// estimate = ((totalSurfaceArea)* (costPerSqFt));

//Outputs
   System.out.println("Your total surface area is " + totalSurfaceArea);

   System.out.println("Your total surface area is " + totalSurfaceAreaFinal);
   System.out.println("Your total estimate is " + estimate);
}

}
