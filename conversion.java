import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        int unidad, decena, centena, millar, numero, temp = 0;
        String[] unidadx = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}; // arreglo
        String[] decenax = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}; // arreglo
        String[] centenax = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};// arreglo
        String[] millarx = {"M", "MM", "MMM"};

        //instanciamos un objeto de la clase Scanner
        Scanner entrada = new Scanner(System.in);

        System.out.printf("%s%n", "CONVERTIDOR DE NUMEROS ENTEROS A ROMANOS DEL RANGO 1-3999");
        System.out.printf("=================================================================%n");
        System.out.printf("Ingrese un numero a convertir: "); // pide a el usuario a insertar Un número
        numero = entrada.nextInt(); //almacena el numero ingresado en la variable numero

        unidad = numero % 10; //residuo de dividir numero por 10
        numero /= 10;         //Almacena en la variable numero el numero dividido por 10.

        decena = numero % 10; //residuo de dividir numero por 10
        numero /= 10;         //Almacena en la variable numero el numero dividido por 10.

        centena = numero % 10;//residuo de dividir numero por 10
        numero /= 10;         //Almacena en la variable numero el numero dividido por 10.

        millar = numero % 10;//residuo de dividir numero por 10

        System.out.println(); // imprime un salto de linea
        System.out.println("RESULTADOS EN ROMANOS:");

        //proceso de conversion
        for (int i = 1; i <= 3; i++) {
            if (millar == i && millar != 0) {
                temp = i - 1;
                System.out.printf("%s", millarx[temp]);
            }


        }

        for (int i = 1; i <= 9; i++) {
            if (centena == i && centena != 0) {
                temp = i - 1;
                System.out.printf("%s", centenax[temp]);
            }
        }

        for (int i = 1; i <= 9; i++) {

            if (decena == i && decena != 0) {
                temp = i - 1;
                System.out.printf("%s", decenax[temp]);
            }
        }

        for (int i = 1; i <= 9; i++) {

            if (unidad == i && unidad != 0) {
                temp = i - 1;
                System.out.printf("%s", unidadx[temp]);
            }
        }
    }
}