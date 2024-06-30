import java.util.Scanner;
public class Usuario {
    private String nome;
    private long codigo;
    private long cpf;
    private Endereco endereco;
    Scanner scan = new Scanner(System.in);

    public void cadastrar(){
        System.out.print("Digite seu nome: ");
        setNome(scan.nextLine());
        this.nome = getNome();
        System.out.print("Digite seu codigo de usuário: ");
        setCodigo(scan.nextLong());
        this.codigo = getCodigo();
        System.out.print("Digite seu cpf: ");
        setCpf(scan.nextLong());

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
