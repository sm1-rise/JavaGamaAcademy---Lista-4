package domain;

import java.util.ArrayList;
import java.util.List;

public class Escola {

  private List<Aluno> listaAluno;
  private List<Professor> listaProfessor;

  public Escola() {
    listaAluno = new ArrayList<>();
    listaProfessor = new ArrayList<>();
  }

  public void imprimirEscola() {
    System.out.println("Alunos matriculados");
    for (Aluno aluno : listaAluno) {
      System.out.println(aluno.getNome());
    }
    System.out.println("Professores efetivados");
    for (Professor professor : listaProfessor) {
      System.out.println(professor.getNome());
    }
  }

  public void adicionarProfessor(Professor professor) {
    listaProfessor.add(professor);
  }

  public void adicionarAluno(Aluno aluno) {
    listaAluno.add(aluno);
  }
}
