package builder;

import java.util.List;

import exception.NutrienteNaoEncontradoException;
import interfaces.Builder;
import model.Alimento;
import model.QuantidadeMacro;
import singleton.CatalogoNutrientes;

public class ComidaDirector {

  public void receitaOvo(Builder builder) throws NutrienteNaoEncontradoException {
    CatalogoNutrientes catalogo = CatalogoNutrientes.getInstance();
    catalogo.create("proteina", "mg", 20.0);

    Alimento ovo = new Alimento("ovo", List.of(catalogo.create("proteina")),
        new QuantidadeMacro(1));
    Alimento sal = new Alimento("sal", List.of(catalogo.create("proteina")),
        new QuantidadeMacro(2));
    Alimento manteiga = new Alimento("manteiga", List.of(catalogo.create("proteina")),
        new QuantidadeMacro(2));

    builder
        .comAlimento(ovo)
        .comAlimento(sal)
        .comAlimento(manteiga)
        .isLowCarb(true)
        .isSemGlutem(true);
  }
}
