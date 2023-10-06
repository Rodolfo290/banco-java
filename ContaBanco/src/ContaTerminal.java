import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        int numero = 1021;
        String nomeCliente = "Rodolfo Oliveira";
        double saldo = 237.48;

        // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Agência !");
        // Obter pelo scanner os valores digitados no terminal
        String agencia = scanner.nextLine();

        // Exibir a mensagem conta criada
        System.out.printf("Olá " + nomeCliente + "," + " obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
