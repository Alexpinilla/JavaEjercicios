import java.util.Scanner;

public class arraydestrings {
    public static void main(String[] args) {/*
        String [] ejemplo = new String[4];
        ejemplo[0]="casa";
        ejemplo[1]="avión";
        ejemplo[2]="hospital";
        ejemplo[3]="Rumbo";
        System.out.println(ejemplo.length);

        for(int i=0; i<ejemplo.length;i++){
            System.out.println(ejemplo[i]);
        }
        for (String v: ejemplo){
            System.out.println(v);
        }*/
/*
        int[][] a = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };/*
        for (int[] i: a){
            System.out.println(i);
        }*//*
        System.out.println("Introduce la file en la que quieres disparar");
        Scanner disparo = new Scanner(System.in);
        Integer bala1 = disparo.nextInt();
        System.out.println("Introduce la columna en la que quieres disparar");
        Integer bala2 = disparo.nextInt();
        if ((a[bala1][bala2]) == 1) {
            System.out.println("¡Felicidades! Has destruido un barco");
        } else {
            System.out.println("fallaste... disparaste al agua");
        }

*/
           /* Scanner num = new Scanner(System.in);
            Integer numIntroducido = num.nextInt();
            for (i = numIntroducido; i > 0; i--) {
                System.out.println(numIntroducido - 1);
            }*/

/*
        Scanner num = new Scanner(System.in);
        Integer numIntroducido = num.nextInt();
        while(numIntroducido!=0){
            System.out.println("Introduce el número 0");
            numIntroducido = num.nextInt();
        }
        System.out.println("correcto,ya introduciste el número requerido");*/

        Scanner num= new Scanner(System.in);
        Integer a=num.nextInt();
        Integer b=num.nextInt();
        suma(a,b);
    }

    public static int suma(int a, int b){
        return a+b;
    }

}
