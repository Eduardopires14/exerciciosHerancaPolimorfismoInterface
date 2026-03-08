package GerenciamentoBiblioteca;

public class Livro extends Midia {
    private String autor;

    public Livro(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Código: " + getCodigo() + " | Livro: " + getTitulo() + " | Autor: " + getAutor());
    }

    public String getAutor() {
        return autor;
    }
}
