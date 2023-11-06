import domains.Pessoa;

public class App {

  public static void main(String[] args) throws Exception {
    Pessoa pessoa1 = new Pessoa("Lux", 17, "não tem");
    pessoa1.apresentar();
  }
}
