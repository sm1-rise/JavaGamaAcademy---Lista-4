package domain;

import java.util.ArrayList;

public class Casa {

  ArrayList<Movel> listaMoveis = new ArrayList<>();

  public ArrayList<Movel> getListarMoveis() {
    return listaMoveis;
  }

  public void setListarMoveis(ArrayList<Movel> listarMoveis) {
    this.listaMoveis = listarMoveis;
  }

  public void adicionarMoveis(Movel movel) {
    listaMoveis.add(movel);
  }
}
