import domain.Loja;
import domain.Produto;

public class App {

  public static void main(String[] args) throws Exception {
    Produto produto1 = new Produto("Mouse", 40.00);
    Produto produto2 = new Produto("Computador", 3000);

    Loja minhaloja = new Loja();

    minhaloja.adicionarProduto(produto1);
    minhaloja.adicionarProduto(produto2);

    minhaloja.calcularTotalLoja();
  }
}
