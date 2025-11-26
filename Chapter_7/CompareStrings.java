import java.util.Scanner;

class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String predefined = "Carmen";

        System.out.print("Enter your name > ");
        String input = scanner.nextLine();

        if (input.equals(predefined)) {
            System.out.println("Carmen equals " + input);
        } else {
            System.out.println("Carmen does not equal " + input);
        }

        scanner.close();
    }

}
