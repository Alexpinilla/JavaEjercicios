import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la altura desde donde cae el objeto");
        int altura = entrada.nextInt();
        System.out.println(Math.sqrt(altura*4.9) + " segundos tardará en caer");
    }
}
