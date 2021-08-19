import java.util.Scanner;
public class hello {

	 public static void main(String[] args) {
	        // Create a tool for reading user input and name it scanner
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("What's your name? ");

	        String message = scanner.nextLine();

	        System.out.println(message);
	        System.out.println("Hi " + message);
	    }
	}