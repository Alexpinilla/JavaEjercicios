import java.util.Scanner;

public class arraaays {
    public static void main(String[] args) {
        int [] numero = new int[10];
        double [] raiz = new double[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qué tabla quieres saber¿?");
        Integer tabla = scanner.nextInt();
        for (int i=0; i<numero.length; i++){
            numero[i] = i+1;
            raiz[i] = tabla * (numero[i]);
            System.out.println(tabla+" x " + numero[i] + " : " + raiz[i]);
        }


        /*
        int [] numero = new int [5];
        numero[0]=0;
        numero[1]=1;
        numero[2]=2;
        numero[3]=3;
        numero[4]=4;

        System.out.println("Posicion 3 ->"+ numero [2]);*/
    }
}
