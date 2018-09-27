import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la base");
        int base = entrada.nextInt();
        System.out.println("Introduce el exponente");
        int exponente = entrada.nextInt();
        int resultado=1;
        for (int i =0; i<exponente; i++){
            resultado*= base;
        }
        System.out.println(resultado);

    }
}
