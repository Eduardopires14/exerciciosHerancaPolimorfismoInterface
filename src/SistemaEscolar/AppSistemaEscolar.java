package SistemaEscolar;

public class AppSistemaEscolar {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Júlia", 16, 8.5);
        Aluno aluno2 = new Aluno("Caio", 17, 7.20);

        Docente docente1 = new Docente("Marta", 40, "Matemática");
        Docente docente2 = new Docente("Roberto", 38, "História");

        aluno2.exibirDados();
        aluno1.exibirDados();

        docente1.exibirDados();
        docente2.exibirDados();
    }
}
