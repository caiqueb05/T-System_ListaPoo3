public class Produto {
    protected String nome;
    protected double preco;
    protected int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void atualizarEstoque(int quantidade) {
        this.quantidadeEmEstoque += quantidade;
    }

    public String exibirDetalhes() {
        return "Nome: " + this.nome + "\n" +
                "Preço: " + this.preco + "\n" +
                "Quantidade em Estoque: " + this.quantidadeEmEstoque;
    }

    public String comprar(int quantidade) {
        if (quantidadeEmEstoque >= quantidade) {
            quantidadeEmEstoque -= quantidade;
            return "Compra bem-sucedida! Você comprou " + quantidade + " " + nome;
        } else {
            return "Compra falhou! Quantidade em estoque insuficiente.";
        }
    }
}
