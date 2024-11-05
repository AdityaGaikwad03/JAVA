import java.util.Scanner;
public class BMICalculator {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter first name: ");
			String firstName = scanner.nextLine();
			System.out.print("Enter last name: ");
			String lastName = scanner.nextLine();
			System.out.print("Enter weight in kg: ");
			double weight = scanner.nextDouble();
			System.out.print("Enter height in meters: ");
			double height = scanner.nextDouble();
			double bmi = weight / (height * height);
			System.out.println("Name: " + firstName + " " + lastName);
			System.out.println("BMI: " + bmi);
		}
	}
}