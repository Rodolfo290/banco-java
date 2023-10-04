import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
   
    public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);        
       
        int numero = 1021;
        // String agencia = "";
        String nomeCliente = "Rodolfo Oliveira";
        double saldo = 237.48;
   
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.printf("Olá " + nomeCliente + "," + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
       


scanner.close();
    }
}
