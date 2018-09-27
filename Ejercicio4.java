import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca kb para convertir");
        float numeroKb = entrada.nextInt();
        System.out.println(numeroKb +" son "+ (float)numeroKb/1024 + " Mb");
    }
}
