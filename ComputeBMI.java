import java.util.Scanner;
public class ComputeBMI{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
final double KILOGRAMS_PER_POUND = 0.453923;
final double METERS_PER_INCH = 0.0254;


System.out.println("Enter weignt in pounds:");
double weignt = input.nextDouble();

  System.out.println("Enter heingt in inches");
  double heingt = input.nextDouble();

  double weigntInkilograms = weignt * KILOGRAMS_PER_POUND;
  double heingtInMeters = heingt * METERS_PER_INCH;

   //double bmi = weigntInkilograms / ( heingtInMeters * heingtInMeters); //

   double bmi = weigntInkilograms / Math.pow(heingtInMeters , 2);

   if (bmi < 16 )
   System.out.println (" Your are seriously underweight");

   else if ( bmi < 18)
   System.out.println("You are underweight");

else if ( bmi < 24)
System.out.println("your are normal weign");
else if ( bmi < 29)
System.out.println("Your are overweing");
else if (bmi < 35)
System.out.println("You are seriusly overweing");
else
System.out.println("you are gravely overweing");









}
}
