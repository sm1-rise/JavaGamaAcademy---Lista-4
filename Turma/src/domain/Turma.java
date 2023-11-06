package domain;

import java.util.ArrayList;

public class Turma {

  private ArrayList<Aluno> listaAluno = new ArrayList<>();

  public ArrayList<Aluno> getListaAluno() {
    return listaAluno;
  }

  public void adicionarAluno(Aluno aluno) {
    listaAluno.add(aluno);
  }

  public void mediaIdadeTurma() {
    int somaIdades = 0;
    double mediaIdades = 0;

    for (Aluno aluno : listaAluno) {
      somaIdades = somaIdades + aluno.getIdade();
    }

    mediaIdades = somaIdades / listaAluno.size();

    System.out.println("A media de idade da turma é: " + mediaIdades);
  }
}
