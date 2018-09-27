package class1;

public class NestedClass {
    public static void main(String[] args) {
        ClaseExterna.ClaseAnidada ClaseExterna = new ClaseExterna.ClaseAnidada();
        ClaseExterna.mostrar();
    }
}
class ClaseExterna {
    static int a = 10;
    static int  b = 20; //error
    private static int c = 30;
    static class ClaseAnidada{
        void mostrar(){
            System.out.println("externo a "+a);
            System.out.println("externo b "+b);
            System.out.println("externo b "+c);
        }
    }
}