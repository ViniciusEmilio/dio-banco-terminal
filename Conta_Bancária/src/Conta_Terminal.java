import java.util.Scanner;

public class Conta_Terminal {
    public static void main(String[] args) {
        // Criando objeto Scanner;
        Scanner scanner = new Scanner(System.in);

        // Usuário digitando o seu nome e a variável armazenando o mesmo;
        System.out.println("Digite o seu nome: ");
        String nomeUsuario = scanner.nextLine(); // Utilizando nextLine() para ler a linha inteira

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine(); // Utilizando nextLine() para ler a linha inteira

        System.out.println("Digite o número da sua Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeUsuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
