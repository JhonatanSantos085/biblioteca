public class Locacao {
    private double valorLocacao;
    private double valorMulta;
    private Funcionario funcionario;
    private  Usuario usuario;
    private Livro livro;
    private Data dataLocacao;
    private Data dataDevolucao;
    private Livro livroLocado;



    public double calcularLocacao(double valorLocacao ){
        return 0.0;
    }
    public void locarLivro(){

    }
    public void devolverLivro(){
        //valorMulta

    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public Livro getLivroLocado() {
        return livroLocado;
    }

    public void setLivroLocado(Livro livroLocado) {
        this.livroLocado = livroLocado;
    }

    public Data getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Data dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Data getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Data dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }
}
