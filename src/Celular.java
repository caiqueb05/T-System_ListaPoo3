import java.util.ArrayList;

public class Celular extends Produto{
    protected String marca;
    protected String modelo;
    protected String armazenamento;
    protected ArrayList<String> aplicativosInstalados = new ArrayList<>();

    public Celular(String nome, double preco, int quantidadeEmEstoque, String marca, String modelo, String armazenamento, String aplicativosInstalados) {
        super(nome, preco, quantidadeEmEstoque);
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.aplicativosInstalados.add(aplicativosInstalados);
    }

    public String exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade em Estoque: " + this.quantidadeEmEstoque);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Armazenamento: " + this.armazenamento);
        System.out.println("Aplicativos Instalados: " + this.aplicativosInstalados);
        return "";
    }

    public void instalarAplicativo(String aplicativo) {
        this.aplicativosInstalados.add(aplicativo);
    }
}
