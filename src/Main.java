import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String response = "";

        System.out.println("Please enter a sentence and press Enter. Pig Latin will be returned.");

        while (!response.equalsIgnoreCase("q")) {
            response = scanner.nextLine();

            if (response.equalsIgnoreCase("q")) {
                System.out.println("Goodbye.");
                break;
            }

            if (!isAlphaOnly(response)) {
                System.out.println("The phrase must only contain letters.");
                break;
            }

            //Show the response - being the converted phrase into pig latin
            System.out.println("");
            System.out.println("\nSupply another phrase, or type 'q' to quit.");
        }
    }

    private static boolean isAlphaOnly(String text) {
        return text.matches("[a-zA-Z]+");
    }
}