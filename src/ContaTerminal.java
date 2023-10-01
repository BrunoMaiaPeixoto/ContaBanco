import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o CPF do cliente: ");
        String CPF = scanner.nextLine();

        System.out.print("Digite a agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero da conta de Usuario");
        int numero = scanner.nextInt();

        Cliente cliente = new Cliente(nome, CPF, agencia, numero);


        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco sua agência é: " +agencia + " conta: " +numero+ "e seu saldo é: " + cliente.getSaldo() + " já está disponível para saque.");
        System.out.println("\nInformações do Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCPF());
        System.out.println("Agência: " + cliente.getAgencia());
        System.out.println("Saldo: " + cliente.getSaldo());
        scanner.close();
    }
}
