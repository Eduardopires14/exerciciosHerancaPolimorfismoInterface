package SistemaEscolar;

public class Aluno extends Pessoa{
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public void exibirDados() {
        System.out.println("Aluno: " + getNome() + " - Idade: " + getIdade() + " - Nota: " + getNota());
    }
}
