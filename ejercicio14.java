import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        int [][] tabla=new int[4][5];
        int i;
        int x;
        Scanner entrada = new Scanner(System.in);
        int entradaUsuario;
        int suma = 0;
        for(i=0; i<4; i++){
            for( x=0; x<5; x++){
                entradaUsuario=entrada.nextInt();
                tabla[i][x]=entradaUsuario;
            }


        }
        int total = 0;
        int sumaFilas = 0;
        for(i=0; i<4; i++){
            for( x=0; x<5; x++){
                sumaFilas +=tabla[i][x];
                total+=tabla[i][x];
                System.out.print(tabla[i][x]+("  "));
            }
            System.out.print(sumaFilas);
            sumaFilas=0;
            System.out.println("");
        }

        int suma2=0;
            for(x = 0; x<5;x++) {
                for (i = 0; i < 4; i++) {
                    suma += tabla[i][x];
                    suma2 += tabla[i][x];
                }
                System.out.print(suma);
                if (suma>9){
                    System.out.print(" ");
                }else{
                    System.out.print("  ");
                }
                suma = 0;
            }
            System.out.println(total);
    }
}
