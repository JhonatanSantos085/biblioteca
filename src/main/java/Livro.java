import java.util.Scanner;
public class Livro {
    private String titulo;
    private String genero;
    private String autor;
    private boolean status;


    Scanner scanner = ScannerUtil.getScanner();

    public void cadastrarLivro(){
        System.out.println("-_ Cadastrar Livro _-");

        System.out.println("Digite o titulo do livro: ");
        setTitulo(scanner.nextLine());

        System.out.println("Digite o Genero do livro");
        setGenero(scanner.nextLine());

        System.out.println("Digite o autor do livro");
        setAutor(scanner.nextLine());




    }







    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    @Override
    public String toString() {
        return "Título: " + titulo + ", Gênero: " + genero + ", Autor: " + autor + ", Status: " + (status ? "Disponível" : "Indisponível");
    }

}
