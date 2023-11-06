package domain;

public class Aluno {

  private int idade;
  private String nome;

  public Aluno() {}

  public Aluno(String nome, int idade) {
    this.idade = idade;
    this.nome = nome;
  }

  /**
   * @return int return the idade
   */
  public int getIdade() {
    return idade;
  }

  /**
   * @param idade the idade to set
   */
  public void setIdade(int idade) {
    this.idade = idade;
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
