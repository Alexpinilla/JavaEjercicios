import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        int primero = 0;
        int segundo = 1;
        Scanner entrada = new Scanner(System.in);
        int numIntroducido = entrada.nextInt();
        for ( int i = 0; i < numIntroducido; i++){
            int nueva = primero + segundo;
            primero = segundo;
            segundo = nueva;
            System.out.println(nueva);
        }

    }
}
