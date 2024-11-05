import java.io.*;
import java.util.*;
public class FileReverser {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the file name: ");
		String fileName = scanner.nextLine();
		List<String> lines = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				lines.add(line);
			}
		}
		Collections.reverse(lines);
		for (int i = 0; i < lines.size(); i++) {
			lines.set(i, reverseCase(lines.get(i)));
		}
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			for (String line : lines) {
				writer.write(line);
				writer.newLine();
			}
		}
		System.out.println("File contents reversed and case changed.");
	}
	private static String reverseCase(String str) {
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(Character.toUpperCase(c));
			}
		}
		return sb.toString();
	}
}
