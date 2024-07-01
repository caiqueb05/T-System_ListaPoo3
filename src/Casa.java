public class Casa extends Produto{
    protected String endereco;
    protected int numeroDeQuartos;
    protected double area;

    public Casa(String nome, double preco, int quantidadeEmEstoque, String endereco, int numeroDeQuartos, double area) {
        super(nome, preco, quantidadeEmEstoque);
        this.endereco = endereco;
        this.numeroDeQuartos = numeroDeQuartos;
        this.area = area;
    }

    public String exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade em Estoque: " + this.quantidadeEmEstoque);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Número de Quartos: " + this.numeroDeQuartos);
        System.out.println("Área: " + this.area);
        return "";
    }

    public void calcularValorImposto() {
        System.out.println("Valor do Imposto: " + this.preco * 0.05);
    }
}
