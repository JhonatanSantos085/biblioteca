import java.util.Scanner;

public class Usuario {
    private String nome;
    private long codigo;
    private long cpf;
    private Endereco endereco;
    Scanner scanner = ScannerUtil.getScanner();

    public void cadastrarUser() {
        System.out.println("-_ Cadastrar Usuario _-");

        System.out.print("Digite seu nome: ");
        setNome(scanner.nextLine());

        System.out.print("Digite seu codigo de usuário: ");
        setCodigo(Long.parseLong(scanner.nextLine())); // Convertendo a entrada para long

        System.out.print("Digite seu cpf: ");
        setCpf(Long.parseLong(scanner.nextLine())); // Convertendo a entrada para long

        // Instanciar um objeto Endereco e chamar o método local
        endereco = new Endereco();
        endereco.local();
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public long getCodigo() {

        return codigo;
    }

    public void setCodigo(long codigo) {

        this.codigo = codigo;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {

        this.cpf = cpf;
    }

    public Endereco getEndereco() {

        return endereco;
    }

    public void setEndereco(Endereco endereco) {

        this.endereco = endereco;
    }
}