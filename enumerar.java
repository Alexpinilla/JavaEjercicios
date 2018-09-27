public class enumerar {
    enum TipoDeMadera {ROBLE, CAOBA, CEREZO, BOJ};
    public static void main(String[] args) {
       TipoDeMadera maderaUsuario;
       maderaUsuario = TipoDeMadera.ROBLE;
       System.out.println(maderaUsuario.toString().toLowerCase());
       System.out.println(maderaUsuario==TipoDeMadera.CAOBA);
       System.out.println(maderaUsuario==TipoDeMadera.ROBLE);
    }
}
