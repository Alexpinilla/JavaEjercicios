import java.util.Scanner;

public class ejemploscaner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu edad");
        Integer edad = scanner.nextInt();
        System.out.println("Tu edad es -> "+ edad);
    }
}
