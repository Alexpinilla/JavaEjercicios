import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        int [] datos = new int[10];
        Scanner entrada= new Scanner(System.in);
        for (int x = 0; x<10; x++){
            datos[x] = entrada.nextInt();
        }
        for (int i =9; i>=0; i--){
            System.out.println(datos[i]);
        }
    }
}
