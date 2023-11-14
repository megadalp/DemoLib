import org.dalp.demolib.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Из нашей библиотеки:\n");

        System.out.println(new LibOne().methodOne());
        System.out.println("\n");

        LibOne.methodTwo();
        System.out.println("\n");

        System.out.println(new LibTwo().methodTwoOne());
        System.out.println("\n");

        LibTwo.methodTwoTwo();
    }
}