import domain.Biblioteca;
import domain.Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Harry Potter","J.K");
        Livro livro2 = new Livro("Lords of Rings","TOKEN");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        System.out.println(biblioteca.listarLivros());
    }
}
