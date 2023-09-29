public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioBase = 1808;
        salarioBase += 100;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.println(salarioBase+" "+numeroCurto2);
    }
}
