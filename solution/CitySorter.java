import java.util.Scanner;
public class CitySorter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of cities: ");
		int n = scanner.nextInt();
		String[] cities = new String[n];
		System.out.println("Enter the city names:");
		for (int i = 0; i < n; i++) {
			cities[i] = scanner.nextLine();
		}
		java.util.Arrays.sort(cities);
		System.out.println("Sorted city names:");
		for (String city : cities) {
			System.out.println(city);
		}
	}
}