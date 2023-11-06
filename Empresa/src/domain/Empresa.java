package domain;

import java.util.ArrayList;

public class Empresa {

  ArrayList<Funcionario> listaFuncionario = new ArrayList<>();

  public ArrayList<Funcionario> getListaFuncionario() {
    return listaFuncionario;
  }

  public void adicionarFuncionario(Funcionario funcionario) {
    listaFuncionario.add(funcionario);
  }

  public void somaSalarioFuncionario() {
    double somaFuncionario = 0;

    for (Funcionario funcionario : listaFuncionario) {
      somaFuncionario = somaFuncionario + funcionario.getSalario();
    }
    System.out.println(
      "A soma dos salario dos funcionarios: " + somaFuncionario
    );
  }
}
