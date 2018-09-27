import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.println("Introduce un número que no sea bisiesto");
        int numIntroducido = num.nextInt();
        System.out.println(bisiesto(numIntroducido));
    }
    private static boolean bisiesto(int numIntroducido){
        if (numIntroducido%4==0 && numIntroducido%100==0){
            return false;
        }
        else {
            return true;
        }
    }
}
