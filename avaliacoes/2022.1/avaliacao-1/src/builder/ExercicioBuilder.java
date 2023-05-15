package builder;

import java.util.ArrayList;
import java.util.List;

import model.Excercicio;
import model.TipoExcercicio;

public class ExercicioBuilder implements Builder<Excercicio> {

  private String nome;
  private List<TipoExcercicio> tipoExcercicio;
  private List<String> gruposMusculares;

  public ExercicioBuilder(String name) {
    resetar(name);
  }

  @Override
  public ExercicioBuilder doTipo(TipoExcercicio tipoExcercicio) {
    this.tipoExcercicio.add(tipoExcercicio);
    return this;
  }

  @Override
  public ExercicioBuilder paraOGrupoMuscular(String grupoMuscular) {
    this.gruposMusculares.add(grupoMuscular);
    return this;
  }

  @Override
  public ExercicioBuilder resetar(String nome) {
    this.nome = nome;
    gruposMusculares = new ArrayList<>();
    tipoExcercicio = new ArrayList<>();
    return this;
  }

  public Excercicio build() {
    return new Excercicio(nome, tipoExcercicio, gruposMusculares);
  }
}
