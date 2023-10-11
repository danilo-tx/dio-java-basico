import java.util.Scanner;
import java.text.DecimalFormat;

public class AdiantamentoDeSalario {
    public static void main(String[] args) throws Exception {
        
        try (Scanner sc = new Scanner(System.in)) {
            double salarioBase = 1808;
            System.out.println("Insira o valor da meta");
            double meta = sc.nextDouble();
            System.out.println("Insira o valor total das vendas");
            double vendas = sc.nextDouble();
            int premiacao = 0;
            double adiantamento = salarioBase * 0.4;
            double comissao = vendas * 0.022;

            if(vendas >= meta){
                if(vendas >= meta * 1.2){
                    premiacao = 1685;
                }else if(vendas >= meta * 1.1){
                    premiacao = 1217;
                }else{
                    premiacao = 936;
                }
            }

            System.out.println("Você irá receber R$: " + new DecimalFormat("#,##0.00").format(premiacao + adiantamento + comissao) + " no dia 15.");
        }
    }
}
