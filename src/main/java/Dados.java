import java.util.ArrayList;
import java.util.List;

public class Dados {
    private List<Livro> livros;

    public Dados() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}