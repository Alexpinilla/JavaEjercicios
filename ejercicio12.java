import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabraIntroducida = entrada.next();
        char invertida[] = new char[palabraIntroducida.length()];
        for (int i=0; i<palabraIntroducida.length(); i++){
            invertida[i]=palabraIntroducida.charAt(i);
        }
        for (int i=palabraIntroducida.length()-1; i>=0; i-- ){
            System.out.print(invertida[i]);
        }
    }
}
