import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input section
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline left by nextInt()

        System.out.println("Enter your favourite programming language:");
        String language = sc.nextLine();

        // Output section
        System.out.println("----- Summary -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Favourite Language: " + language);

        sc.close();
    }
}
