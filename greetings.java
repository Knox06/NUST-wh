import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.err.println("USER IS BACK");
        System.out.println(" ");
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Welcome "+name);
    }
}
