package domain;

public class ContaBancaria {

  private double saldo;
  private String numConta;

  public ContaBancaria() {}

  public ContaBancaria(double saldo, String numConta) {
    this.saldo = saldo;
    this.numConta = numConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public String getNumConta() {
    return numConta;
  }

  public void setNumConta(String numConta) {
    this.numConta = numConta;
  }

  public void depositar(double valor) {
    setSaldo(getSaldo() + valor);
  }

  public void sacar(double valor) {
    if (valor <= getSaldo()) {
      setSaldo(getSaldo() - valor);
    } else {
      System.out.println("Saldo insuficiente");
    }
  }
}
