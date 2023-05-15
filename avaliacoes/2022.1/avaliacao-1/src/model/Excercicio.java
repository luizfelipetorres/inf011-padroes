package model;

import java.util.List;

import builder.ExercicioBuilder;

public class Excercicio {

  private final String nome;
  private final List<TipoExcercicio> tipoExcercicio;
  private final List<String> gruposMusculares;

  public Excercicio(String nome, List<TipoExcercicio> tipoExcercicio,
                    List<String> gruposMusculares) {
    this.nome = nome;
    this.tipoExcercicio = tipoExcercicio;
    this.gruposMusculares = gruposMusculares;
  }

  public static ExercicioBuilder builder(String nome) {
    return new ExercicioBuilder(nome);
  }
}
