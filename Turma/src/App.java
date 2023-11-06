import domain.Aluno;
import domain.Turma;

public class App {

  public static void main(String[] args) throws Exception {
    Aluno aluno1 = new Aluno("jOGIM", 18);
    Aluno aluno2 = new Aluno("cAMILA", 16);
    Aluno aluno3 = new Aluno("GUSTavo", 17);

    Turma turma = new Turma();

    turma.adicionarAluno(aluno1);
    turma.adicionarAluno(aluno2);
    turma.adicionarAluno(aluno3);

    turma.mediaIdadeTurma();
  }
}
