import domain.Aluno;
import domain.Escola;
import domain.Professor;

public class App {

  public static void main(String[] args) throws Exception {
    Aluno aluno1 = new Aluno("Fábio");
    Aluno aluno2 = new Aluno("Jaqueline");

    Professor professor1 = new Professor("Robson");
    Professor professor2 = new Professor("Eduarda");

    Escola minhaEscola = new Escola();

    minhaEscola.adicionarAluno(aluno1);
    minhaEscola.adicionarAluno(aluno2);

    minhaEscola.adicionarProfessor(professor1);
    minhaEscola.adicionarProfessor(professor2);

    minhaEscola.imprimirEscola();
  }
}
