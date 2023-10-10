import java.util.Scanner;

public class TiposVariaveis {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        double salarioBase = 1808;
        System.out.println("Insira o valor da meta");
        int meta = sc.nextInt();
        System.out.println("Insira o valor total das vendas");
        int vendas = sc.nextInt();
        int premiacao = 0;
        double adiantamento = salarioBase * 0.4;
        double comissao = vendas * 0.022;
        
        if(meta < vendas){
            premiacao = 1000;
        }

        
        System.out.println(premiacao + adiantamento + comissao);
    }
}
