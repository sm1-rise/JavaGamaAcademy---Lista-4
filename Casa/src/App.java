import domain.Casa;
import domain.Movel;

public class App {

  public static void main(String[] args) throws Exception {
    Movel movel1 = new Movel("Mesa");
    Movel movel2 = new Movel("Armario");
    Movel movel3 = new Movel("Cadeira");

    Casa casa = new Casa();

    casa.adicionarMoveis(movel1);
    casa.adicionarMoveis(movel2);
    casa.adicionarMoveis(movel3);

    System.out.println(casa.getListarMoveis());
  }
}
