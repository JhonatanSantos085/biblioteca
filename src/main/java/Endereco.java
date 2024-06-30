import java.util.Scanner;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;

    Scanner scanner = ScannerUtil.getScanner();

    public void local() {
        System.out.println("-_ Digite seu Endereco _-");
        System.out.print("Digite o nome da rua: ");
        setRua(scanner.nextLine());

        System.out.print("Digite o numero da sua casa: ");
        setNumero(Integer.parseInt(scanner.nextLine())); // Consumir a nova linha residual

        System.out.print("Digite o seu Bairro: ");
        setBairro(scanner.nextLine());
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}