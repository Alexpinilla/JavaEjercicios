import java.util.Scanner;

class BinaryArray {
    private String objetoString;

    public BinaryArray(String objetoString) {
        this.objetoString = objetoString;
    }
    public String getVariable(){
        return objetoString;
    }
    public void setVariable(String nuevaVariable){
        this.objetoString=nuevaVariable;
    }

}

public class Ejercicio1 {
    public static void main(String[] args) {

        boolean[] matriz = new boolean[4];
        String representacion = "FTTF";
        BinaryArray binaryArray = new BinaryArray(representacion);

        char[] matrizCaracteres = binaryArray.getVariable().toCharArray();

        for (int x = 0; x < matrizCaracteres.length; x++) {
            if (matrizCaracteres[x] == 'F' ){
                matriz[x] = false;
            } else {
                matriz[x]=true;
            }
            System.out.println(matriz[x]);
        }

    }
}