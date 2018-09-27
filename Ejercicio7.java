import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿De cuántos números quieres obtener la media");
        int totalNumeros = entrada.nextInt();
        int []array = new int [totalNumeros];
        for ( int x=0; x<totalNumeros; x++){
            System.out.println("Introduzca el número:");
            array[x]=entrada.nextInt();
        }
        int sumaNumeros = 0;
        for ( int i=0; i<totalNumeros; i++){
            sumaNumeros += array[i];
        }
        System.out.println("La media es: "+sumaNumeros/totalNumeros);
    }
}
