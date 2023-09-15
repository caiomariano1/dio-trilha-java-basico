import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {   
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja bem-vindo ao NossoBanco");
       
        System.out.println("Insira o número da Agência ex.:(xxx-x)");
        String agencia = scanner.next();
        
        System.out.println("Digite o Número da sua conta ex.:(xxxx)");
        int numero = scanner.nextInt();

        System.out.println("Insira o seu Nome ex.:(NomeSobrenome)");
        String nomeCliente = scanner.next();

        System.out.println("Insira o valor que deseja depositar ex.:(xxx.xx)");
        double saldo = scanner.nextDouble();

        scanner.close();
        
        System.out.println();
        System.out.println("***************************************************************");
        System.out.println("Olá " + nomeCliente + "," + " obrigado por criar uma conta em nosso banco !");
        System.out.println("Sua agência é: " + agencia + "," + " conta: " + numero + " e seu saldo de " + saldo);
        System.out.println("já está disponível para saque !");
        System.out.println("***************************************************************");

    }
}
