import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = ScannerUtil.getScanner();

        int opcao;
        do{
            System.out.println("Escolha uma opção abaixo\n" +
                    "[1] - Cadastrar funcionário\n" +
                    "[2] - Cadastrar usuário\n" +
                    "[3] - Cadastrar livro\n" +
                    "[4] - Mostrar todos os dados do cadastro\n" +
                    "[5] - Ir para locação \n"
                    +"[0] - Sair\n"
                    + "Digite aqui a opção: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("Encerrando programa!");
                    break;
                case 1:

                case 2:
                    System.out.println("-_ Cadastrar Usuario _-");
                    Usuario user = new Usuario();
                    user.cadastrar();
                    break;
            }

        }while(opcao != 0);
        scanner.close();
    }

}
