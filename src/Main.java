import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Criando uma lista de produtos
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Produto Teste", 100.0, 50));
        produtos.add(new Casa("Casa Teste", 500000.0, 1, "Rua Teste, 123", 3, 200.0));
        produtos.add(new Celular("Celular Teste", 2000.0, 10, "Marca Teste", "Modelo Teste", "64GB", "App Teste"));

        while (true) {
            System.out.println("--------------------Sistema de Compra Simples--------------------");
            System.out.println("Digite a opção: 1- Ver produtos disponíveis / 2- Comprar produto / 3- Sair");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    // Exibir produtos disponíveis
                    for (Produto produto : produtos) {
                        System.out.println(produto.exibirDetalhes());
                    }
                    break;
                case 2:
                    // Comprar produto
                    System.out.println("Digite o índice do produto que deseja comprar:");
                    int indice = sc.nextInt();
                    System.out.println("Digite a quantidade que deseja comprar:");
                    int quantidade = sc.nextInt();
                    if (indice >= 0 && indice < produtos.size()) {
                        System.out.println(produtos.get(indice).comprar(quantidade));
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;
                case 3:
                    // Sair
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}