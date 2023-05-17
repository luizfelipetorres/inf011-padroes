import builder.ComidaDirector;
import builder.FichaNutricionalBuilder;
import builder.PreparoBuilder;
import exception.NutrienteNaoEncontradoException;
import model.Nutriente;
import singleton.CatalogoNutrientes;

public class App {

  public static void main(String[] args) throws NutrienteNaoEncontradoException {
    System.out.println("Questão 1");
    q1();
    System.out.println("Questão 2");
    q2();

  }

  private static void q2() throws NutrienteNaoEncontradoException {
    PreparoBuilder preparoBuilder = new PreparoBuilder("ovo frito");
    FichaNutricionalBuilder fichaBuilder = new FichaNutricionalBuilder();
    ComidaDirector director = new ComidaDirector();

    director.receitaOvo(preparoBuilder);
    director.receitaOvo(fichaBuilder);

    System.out.println(preparoBuilder.prepar());
    System.out.println(fichaBuilder.imprimir());
  }

  private static void q1() throws NutrienteNaoEncontradoException {
    CatalogoNutrientes catalogo = CatalogoNutrientes.getInstance();
    catalogo.create("proteina", "mg", 20.0);

    Nutriente proteina = catalogo.create("proteina");
    System.out.println(proteina);
  }
}
