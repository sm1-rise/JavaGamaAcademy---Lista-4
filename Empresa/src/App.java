import domain.Empresa;
import domain.Funcionario;

public class App {

  public static void main(String[] args) throws Exception {
    Funcionario funcionario1 = new Funcionario("Batista", "Coordenador", 2000);
    Funcionario funcionario2 = new Funcionario("Fabiane", "Gerente", 5000);

    Empresa minhaEmpresa = new Empresa();
    minhaEmpresa.adicionarFuncionario(funcionario1);
    minhaEmpresa.adicionarFuncionario(funcionario2);

    minhaEmpresa.somaSalarioFuncionario();
  }
}
