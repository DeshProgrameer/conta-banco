import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO:conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário
        // Obter pela scanner os valores digitados no terminal
        //Exibir a mensagen conta criada

        Scanner scanner = new Scanner(System.in);

                System.out.println("Por favor, digite o nome do Titular da conta ! ");
        String nomeTitular = scanner.nextLine();

                System.out.println("Por favor, digite o número da Conta ! ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência ! ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da conta ! ");
        double saldo = scanner.nextDouble();

        ContaTerminal conta = new ContaTerminal();

        System.out.println("Olá, " + nomeTitular + " obrigado por criar uma conta conosco, sua agência é " + agencia + "  conta  " + numero + " e seu saldo de " + saldo + " já está disponível para saque. ");
    }
}
