import java.util.Scanner;
public class TemperatureConverter {

	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Celsius to Fahrenheit");
		System.out.println("2.Fahrenheit to Celsius");
		System.out.println("3.Celsius to kelvin");
		
		System.out.println("Enter your choice :");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: System.out.println("Enter Celsius :");
		double c = sc.nextDouble();
		
		double f = (9.0/5.0)* c + 32;
		System.out.println("Fahrenheit = " + f);
		break;
		
		case 2: System.out.println("Enter Fahrenheit :");
		double  fah = sc.nextDouble();
		
		double cel = (fah-32)*5.0/9.0;
		
		System.out.println("Celsius = " + cel);
		break;
		
		case 3: System.out.println("Enter Celsius :");
		double celsius = sc.nextDouble();
		
		double kelvin = celsius + 273.15;
		System.out.println("Kelvin = " + kelvin);
		break;
		
		default:
		System.out.println("Invalid choice"); 
		}
		
		
	}

}
