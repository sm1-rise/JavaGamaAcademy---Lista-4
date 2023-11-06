package domain;

import java.util.ArrayList;
import java.util.List;

public class Loja {

  private List<Produto> listaProdutos;

  public Loja() {
    listaProdutos = new ArrayList<>();
  }

  public void adicionarProduto(Produto produto) {
    listaProdutos.add(produto);
  }

  public void calcularTotalLoja() {
    double valorLoja = 0;
    for (Produto produto : listaProdutos) {
      valorLoja += produto.getPreco();
    }
    System.out.println("VALOR TOTAL LOJA: " + valorLoja);
  }
}
