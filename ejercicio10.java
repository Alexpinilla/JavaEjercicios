import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int altura = entrada.nextInt();
        int x = 0;
        for (x = 0; x<altura; x++) {
            System.out.println("x");
            for(int i=0; i<x; i++){
                System.out.print(" ");
            }
        }
    }
}
