import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PigLatinConverter converter = new PigLatinConverter();

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
            response = converter.convertPhrase(response);

            //Example: I have a secret to tell you
            //Turns into: ave-hay a-yay ecret-say o-tay ell-tay you-yay

            System.out.println("Converted: " + response);
            System.out.println("\nSupply another phrase, or type 'q' to quit.");
        }
    }

    private static boolean isAlphaOnly(String text) {
        return text.replace(" ", "").matches("[a-zA-Z]+");
    }
}