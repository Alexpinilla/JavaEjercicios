import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Anagramas {
    public static void main(String[] args) {
    LeerAnagrama lectura = new LeerAnagrama();
    lectura.buscarAnagrama();
    }
}

class LeerAnagrama {

        public void buscarAnagrama () {
            try {
                FileReader entrada = new FileReader("C:/Users/Alex/Desktop/A L E X/java/wordlist.txt");
                BufferedReader buffer = new BufferedReader(entrada);
                Scanner entrada2 = new Scanner(System.in);

                String palabra = "";
                int contador=0;
                String palabraIntroducida = entrada2.nextLine();
                char [] palabraOrdenada;
                char [] palabraIntroducidaOrdenada = palabraIntroducida.toCharArray();
                java.util.Arrays.sort(palabraIntroducidaOrdenada);
                String prueba ;

                while (palabra != null) {
                    palabra = buffer.readLine();
                    palabraOrdenada = palabra.toCharArray();
                    java.util.Arrays.sort(palabraOrdenada);
                    while(palabraOrdenada == palabraIntroducidaOrdenada){
                        contador += 1;
                    }
                }
                System.out.println(contador);

            } catch (IOException e) {
                System.out.println("Error.");
            }
        }
}

