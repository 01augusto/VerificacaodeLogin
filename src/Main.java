import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String nomeUsuarioCorreto = "admin";
        String senhaCorreta = "159135";

        // 2. Peça ao usuário para inserir um nome de usuário e uma senha.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de usuário: ");
        String nomeUsuarioInserido = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senhaInserida = scanner.nextLine();

        // 3. Verifique se o nome de usuário e a senha inseridos correspondem aos valores corretos.
        if (nomeUsuarioInserido.equals(nomeUsuarioCorreto) && senhaInserida.equals(senhaCorreta)) {
            // 4. Imprima uma mensagem de sucesso ou de erro, dependendo da validação.
            System.out.println("Autorizada!");
        } else {
            System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
        }












    }
}