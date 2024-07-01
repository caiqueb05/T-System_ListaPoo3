public class Funcionario extends Pessoa{
    protected String cargo;
    protected double salario;
    protected String departamento;

    public Funcionario(String nome, int idade, double altura, double peso, String cargo, double salario, String departamento) {
        super(nome, idade, altura, peso);
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void promover(String novoCargo, double novoSalario) {
        this.cargo = novoCargo;
        this.salario = novoSalario;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salário: " + this.salario);
        System.out.println("Departamento: " + this.departamento);
    }
}
