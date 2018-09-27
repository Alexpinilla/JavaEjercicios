import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        String[] mil = {"M", "MM", "MMM"};
        String[] cien = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] diez = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] uno = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        Scanner num = new Scanner(System.in);
        System.out.println("Introduzca el número que desea convertir");
        int numIntroducido = num.nextInt();
        if (numIntroducido>=1000){
        int a = numIntroducido / 1000;
        int b = (numIntroducido % 1000)/100;
        int c = ((numIntroducido %1000)%100)/10;
        int d = ((numIntroducido %1000)%100)%10;
        String la = mil[a+1];
        String lb = cien[b+1];
        String lc = diez[c+1];
        String ld = uno[d+1];
        String resultado= la+lb+lc+ld;
        System.out.println(resultado);}
        else if(numIntroducido >=100){
            int e = numIntroducido / 100;
            int f = (numIntroducido % 100)/10;
            int g = ((numIntroducido %100)/10);
            String la = mil[e+1];
            String lb = cien[f+1];
            String lc = diez[g+1];
            String resultado= la+lb+lc;
            System.out.println(resultado);
        }
        else if(numIntroducido >=10){
            int h = numIntroducido / 10;
            int i = (numIntroducido % 10);
            String la = diez[h-1];
            String lb = uno[i-1];
            String resultado= la+lb;
            System.out.println(resultado);
        }
        else if(numIntroducido >=1){
            String resultado=uno[numIntroducido-1];
            System.out.println(resultado);
        }


    }

/*
    private static String convertidor(int numIntroducido) {
    }*/
}
