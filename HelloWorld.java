import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Hello, " + name + "!");

        File f = new File("Class.txt");
        input = new Scanner(f);

        String course = input.nextLine();

        System.out.println("Welcome to " + course + "!");

        input.close();
    }
}