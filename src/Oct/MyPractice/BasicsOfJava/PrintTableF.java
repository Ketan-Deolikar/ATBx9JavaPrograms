package Oct.MyPractice.BasicsOfJava;

public class PrintTableF {
    public static void main(String[] args) {
        // Header of the table
        System.out.printf("%-15s %-15s %-10s%n", "Name", "Subject", "Marks");

        //Divide line
        System.out.printf("%-15s %-15s %-10s%n", "--------", "--------", "--------");

        //Table rows
        System.out.printf("%-15s %-15s %-10d%n", "Alice", "Math", 89);
        System.out.printf("%-15s %-15s %-10d%n", "Bob", "Science", 90);
        System.out.printf("%-15s %-15s %-10d%n", "Charlie", "History", 78);
    }
}
