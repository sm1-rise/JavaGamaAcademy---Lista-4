package domain;

public class Movel {

  private String nome;

  public Movel() {}

  public Movel(String nome) {
    this.nome = nome;
  }

  /**
   * @return String return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "Movel [nome=" + nome + "]";
  }
}
