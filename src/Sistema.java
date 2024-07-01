import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private List<Filme> filmes;
    private Scanner scanner;

    public Sistema() {
        this.filmes = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void adicionarFilme() {
        System.out.println("Digite o nome do filme:");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço do filme:");
        double preco = scanner.nextDouble();
        System.out.println("Digite a quantidade em estoque:");
        int quantidadeEmEstoque = scanner.nextInt();
        scanner.nextLine(); // Consumir a linha restante
        System.out.println("Digite o título do filme:");
        String titulo = scanner.nextLine();
        System.out.println("Digite o gênero do filme:");
        String genero = scanner.nextLine();
        System.out.println("Digite a duração do filme:");
        int duracao = scanner.nextInt();
        System.out.println("Digite a classificação indicativa do filme:");
        int classificacaoIndicativa = scanner.nextInt();

        Filme filme = new Filme(nome, preco, quantidadeEmEstoque, titulo, genero, duracao, classificacaoIndicativa);
        filmes.add(filme);
    }

    public void listarFilmes() {
        for (Filme filme : filmes) {
            System.out.println(filme);
        }
    }

    public Filme buscarFilme(String titulo) {
        for (Filme filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                return filme;
            }
        }
        return null;
    }
}