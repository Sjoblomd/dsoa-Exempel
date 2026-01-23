import java.util.Random;
import java.util.Scanner;

public class CC_RandomRundown {
    public static void main(String[] args) {

        Scanner textInput = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int number = random.nextInt(100) + 1;
            System.out.println("Slumptal: " + number);

            System.out.print("(enter för ett nytt, q för att avsluta): ");
            String input = textInput.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Tack o hej!");
                System.exit(0);
            }
        }


    }
}