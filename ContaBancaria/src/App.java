import domain.ContaBancaria;

public class App {

  public static void main(String[] args) throws Exception {
    ContaBancaria minhaConta = new ContaBancaria(1000, "26324-8");

    minhaConta.depositar(500);
    minhaConta.sacar(100);
    System.out.println(minhaConta.getSaldo());
  }
}
