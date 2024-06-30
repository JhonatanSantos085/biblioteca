import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = ScannerUtil.getScanner();

        int opcao;
        do {
            System.out.println("Escolha uma opção abaixo\n" +
                    "[1] - Cadastrar funcionário\n" +
                    "[2] - Cadastrar usuário\n" +
                    "[3] - Cadastrar livro\n" +
                    "[4] - Mostrar todos os dados do cadastro\n" +
                    "[5] - Ir para locação \n" +
                    "[0] - Sair\n" +
                    "Digite aqui a opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha residual

            switch (opcao) {
                case 0:
                    System.out.println("Encerrando programa!");
                    break;
                case 1:
                    // Implementar a lógica de cadastro de funcionário aqui
                    Funcionario func = new Funcionario();
                    func.cadastrarFun();
                    System.out.println("Funcionário " + func.getNome() + " Cadastrado com sucesso!");
                    break;
                case 2:
                    Usuario user = new Usuario();
                    user.cadastrarUser();
                    System.out.println("User: "+ user.getNome()+ " Cadastrado com sucesso!!");
                    break;
                case 3:
                    // Implementar a lógica de cadastro de livro aqui
                    break;
                case 4:
                    // Implementar a lógica de mostrar todos os dados do cadastro aqui
                    break;
                case 5:
                    // Implementar a lógica de locação aqui
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);
        scanner.close();
    }
}