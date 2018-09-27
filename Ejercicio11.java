import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numeroIntroducido;
        int positivos = 0;
        int negativos = 0;
        int numerosTotales=entrada.nextInt();
        for (int i=0; i<numerosTotales; i++){
            numeroIntroducido=entrada.nextInt();
            if (numeroIntroducido >0){
                positivos +=1;
            }
            else{
                negativos+=1;
            }
        }
        System.out.println("Numeros positivos: "+ positivos);
        System.out.println("Numeros negativos: "+ negativos);
    }
}
