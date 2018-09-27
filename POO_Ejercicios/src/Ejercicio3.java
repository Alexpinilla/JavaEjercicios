import java.util.Scanner;

public class Ejercicio3 {
}
class Polynomial {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el grado del polinomio");
        int gradoPolinomio = entrada.nextInt();
        int polinomio[] = new int[gradoPolinomio+1];
        int coeficiente ;
        polinomio[gradoPolinomio]=0;
        for (int x = 0; x < gradoPolinomio-1; x++ ){
            System.out.println("Introduce el coeficiente del grado "+ x);
            coeficiente = entrada.nextInt();
            polinomio[x] = coeficiente;
        }
        System.out.println("Introduce el grado del polinomio 2");
        int gradoPolinomio2 = entrada.nextInt();
        int polinomio2[] = new int[gradoPolinomio2+1];
        polinomio2[0]=0;
        int coeficiente2 ;
        for (int x = 1; x < gradoPolinomio2; x++ ){
            System.out.println("Introduce el coeficiente del grado "+ x);
            coeficiente2 = entrada.nextInt();
            polinomio2[x] = coeficiente2;
        }
        // lectura primer polinomio
        System.out.println("Polinomio 1:");
        for (int x= 0; x<gradoPolinomio; x++){
            if (x>1){
                System.out.print(polinomio[x] + ("x^") + x + (" "));
            }
            else if (x==1){
                System.out.print(polinomio[x] + ("x") + (" "));
            }
            else {
                System.out.print(polinomio[x] + (" "));

            }
        }
        System.out.println();
        System.out.println();
        ///////////////////////////////////////
        // lectura segundo polinomio
        System.out.println("Polinomio 2:");
        for (int x= 0; x<gradoPolinomio2; x++){
            if (x>1){
                System.out.print(polinomio2[x] + ("x^") + x + (" "));
            }
            else if (x==1){
                System.out.print(polinomio2[x] + ("x") + (" "));
            }
            else {
                System.out.print(polinomio2[x] + ("  "));
            }
        }
        System.out.println();
        System.out.println();
        ///////////////////////////////////////
        ////// m u l t i p l i c a c i ó n ///////
        int resultado [] = new int [polinomio.length];
        int resultado2 [] = new int [polinomio.length];
        for (int x = 0; x<resultado.length; x++){
            resultado[x]=0;
        }
        int gradoRes = polinomio.length*polinomio2.length;

            for (int i = 1; i < polinomio.length; i++) {
                for (int x = 1; x < polinomio2.length; x++) {
                    resultado[x] += polinomio[i] * polinomio2[x];

                }
                ///// l e c t u r a    r e s u l t a d o /////
                for (int x = 0; x<resultado.length;x++){
                    System.out.println(resultado[x]);
                }
                System.out.println();
                /////////////////////////////////////////////
            }
    }
}