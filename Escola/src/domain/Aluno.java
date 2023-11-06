package domain;

public class Aluno {

  private String nome;

  public Aluno(String nome) {
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
}
