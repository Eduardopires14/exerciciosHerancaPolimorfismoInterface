package GerenciamentoBiblioteca;

public class Ebook extends Midia{
    private String formato;

    public Ebook(String titulo, int anoPublicacao, String formato) {
        super(titulo, anoPublicacao);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Código: " + getCodigo() + " | Livro: " + getTitulo() + " | Formato: " + getFormato());

    }
}
