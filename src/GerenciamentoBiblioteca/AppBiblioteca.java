package GerenciamentoBiblioteca;

public class AppBiblioteca {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Guia do Mochileiro", 1979, "Douglas Adams");

        Revista revista1 = new Revista("National Geographic", 2023, 245);

        Ebook ebook1 = new Ebook("Clean Code", 2008, "PDF");

        livro1.exibirInfo();
        revista1.exibirInfo();
        ebook1.exibirInfo();
    }
}
