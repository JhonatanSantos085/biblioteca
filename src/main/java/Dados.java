import java.util.ArrayList;
import java.util.List;

public class Dados {
    private List<Livro> livros;
    private List<Funcionario> funcionarios;
    private List<Usuario> usuarios;

    public Dados() {
        livros = new ArrayList<>();
        funcionarios = new ArrayList<>();
        usuarios = new ArrayList<>();

    }

    public Livro verificaLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public void adiconarUsuario(Usuario user){
        usuarios.add(user);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
    public void listarFuncionarios(){
        for (Funcionario funcionario : funcionarios){
            System.out.println(funcionario);
        }
    }

    public void listarUsuarios(){
        for (Usuario user : usuarios){
            System.out.println(user);
        }
    }



}