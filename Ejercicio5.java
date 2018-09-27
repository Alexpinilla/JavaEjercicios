import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce el Radio");
        float radio= entrada.nextInt();
        System.out.println("Introduce la altura");
        float altura= entrada.nextInt();
        System.out.println((3.14*radio*radio*altura)/3);
    }
}
