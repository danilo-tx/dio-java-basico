import java.util.Scanner;
import java.text.DecimalFormat;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Por gentileza, insira seu nome completo: ");
            String nomeCliente = sc.nextLine();
            System.out.println("Agora, informe o número da Agência com o dígito \"XXX-X\": ");
            String numeroAgencia = sc.nextLine();
            System.out.println("Agora, informe o número da Conta \"XXXX\": ");    
            int numeroDaConta = sc.nextInt();
            System.out.println("Informe o valor do depósito inicial: ");
            double saldo = sc.nextDouble();


            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +", conta " + numeroDaConta + " e seu saldo " + new DecimalFormat("R$ #,##0.00").format(saldo) + " já está disponível para saque.");
        }
        }
    }