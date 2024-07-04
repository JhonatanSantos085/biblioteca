import java.util.Scanner;

public class Funcionario {
    private String nome;
    private long cpf;
    private String cargo;
    private double salario;
    private Endereco endereco;

    Scanner scanner = ScannerUtil.getScanner();

    public void cadastrarFun(){
        System.out.println("-_ Cadastrar Funcionario _-");

        System.out.print("Digite seu nome: ");
        setNome(scanner.nextLine());

        System.out.print("Digite seu cpf: ");
        setCpf(Integer.parseInt(scanner.nextLine()));

        System.out.print("Digite seu cargo: ");
        setCargo(scanner.nextLine());

        System.out.print("Digite seu salario: ");
        setSalario(Float.parseFloat(scanner.nextLine()));


        endereco =new Endereco();
        endereco.local();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return "Nome: "+nome+", CPF: "+cpf+", CARGO: "+cargo+", SALARIO: R$"+salario+", Endereco: "+endereco;
    }
}
