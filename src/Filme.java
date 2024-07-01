import java.util.ArrayList;

public class Filme extends Produto {
    protected String titulo;
    protected String genero;
    protected int duracao;
    protected int classificacaoIndicativa;
    protected ArrayList<Filme> listaFilmes = new ArrayList<>();

    public Filme(String nome, double preco, int quantidadeEmEstoque, String titulo, String genero, int duracao, int classificacaoIndicativa) {
        super(nome, preco, quantidadeEmEstoque);
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void cadastrarFilme(Filme filme) {
        this.listaFilmes.add(filme);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "Preço: " + this.preco + "\n" +
                "Quantidade em estoque: " + this.quantidadeEmEstoque + "\n" +
                "Titulo: " + this.titulo + "\n" +
                "Gênero: " + this.genero + "\n" +
                "Duração: " + this.duracao + "\n" +
                "Classificação Indicativa: " + this.classificacaoIndicativa;
    }
}
