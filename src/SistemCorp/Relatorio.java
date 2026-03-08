package SistemCorp;

public class Relatorio implements Imprimivel{

    private String titulo;
    private String texto;

    public Relatorio(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
    }

    @Override
    public void imprimir() {
        System.out.println("Título: " + getTitulo() + "\nConteúdo: " + getTexto());
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }
}
