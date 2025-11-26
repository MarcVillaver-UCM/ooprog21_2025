public class StringBuilderDemo {
    public static void main(String[] args) {

        // StringBuilder 1
        StringBuilder nameString = new StringBuilder("Barbara");
        System.out.println("(StringBuilder 1) nameString: " + nameString);
        System.out.println("Capacity of nameString is: " + nameString.capacity());

        // StringBuilder 2
        StringBuilder addressString = new StringBuilder("6311 Hickory Nut Grove Road");
        System.out.println("(StringBuilder 2) addressString: " + addressString);
        System.out.println("Capacity of addressString is: " + addressString.capacity());

        // Altering lengths using setLength()
        nameString.setLength(20);
        addressString.setLength(20);

        System.out.println("\n(Length set to 20 for StringBuilder 1) The name is " + nameString);
        System.out.println("(Length set to 20 for StringBuilder 2) The address is " + addressString);
    }
}
