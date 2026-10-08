import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declarations
        double length = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash = "";
        System.out.println("Enter in the length of your rectangle: ");
        if (in.hasNextDouble()) {
            length = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input! Please enter a number.");
            System.exit(0);
        }

        System.out.println("Enter in the width of your rectangle: ");
        if (in.hasNextDouble()) {
            width = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input! Please enter a number.");
            System.exit(0);
        }

        area = length * width;
        perimeter = (length * 2) + (width * 2);
        diagonal = Math.sqrt((length * length) + (width * width));

        System.out.println("The area of your rectangle is: " + area);
        System.out.println("The perimeter of your rectangle is: " + perimeter);
        System.out.println("The diagonal of your rectangle is: " + diagonal);
    }
}