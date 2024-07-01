public class Pessoa {
    protected String nome;
    protected int idade;
    protected double altura;
    protected double peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public int envelhecer() {
        return this.idade++;
    }

    public void engordar(double peso) {
        this.peso += peso;
    }

    public void emagrecer(double peso) {
        this.peso -= peso;
    }

    public String mostrarInformacoes() {
        return "Nome: " + this.nome + "\n" +
                "Idade: " + this.idade + "\n" +
                "Altura: " + this.altura + "\n" +
                "Peso: " + this.peso;
    }
}
