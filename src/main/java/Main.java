import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = ScannerUtil.getScanner();
        Dados dados = new Dados();

        int opcao;
        int opcao2;
        int opcao3;
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
                    dados.adicionarFuncionario(func);
                    break;
                case 2:
                    Usuario user = new Usuario();
                    user.cadastrarUser();
                    System.out.println("User: "+ user.getNome()+ " Cadastrado com sucesso!!");
                    dados.adiconarUsuario(user);
                    break;
                case 3:
                    Livro book = new Livro();
                    book.cadastrarLivro();
                    book.setStatus(true);
                    dados.adicionarLivro(book);
                    System.out.println("O livro foi cadastrado com sucesso!");
                    break;
                case 4:
                    // Implementar a lógica de mostrar todos os dados do cadastro aqui
                    do {
                        System.out.println("Escolha uma opção abaixo\n" +
                                "[1] - ExibirInfo funcionário\n" +
                                "[2] - ExibirInfo usuário\n" +
                                "[3] - ExibirInfo livro\n" +
                                "[0] - Voltar ao menu principal\n");

                        opcao2 = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcao2){
                            case 0:
                                System.out.println("Voltando ao menu principal!!");
                                break;

                            case 1:
                                System.out.println("Exibindo informacoes sobre funcionarios");
                                dados.listarFuncionarios();
                                break;
                            case 2:
                                System.out.println("Exibindo informacoes sobre usuarios cadastrados");
                                dados.listarUsuarios();
                                break;
                            case 3:
                                System.out.println("Exibindo informacoes de livros cadastrados");
                                System.out.println("Dados cadastrados:");
                                dados.listarLivros();
                                break;

                        }

                    }while(opcao2 != 0);
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