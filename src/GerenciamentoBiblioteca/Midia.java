package GerenciamentoBiblioteca;

public abstract class Midia {
    private String titulo;
    private int anoPublicacao;
    private String codigo;

    public Midia(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.codigo =  "LIB" + "-" + titulo.substring(0,3) + getAnoPublicacao();
    }

    public abstract void exibirInfo();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getCodigo() {
        return codigo;
    }
}
