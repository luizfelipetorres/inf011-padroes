package model;

import java.util.List;

public class Alimento {

  private String nome;
  private List<Nutriente> nutriente;
  private QuantidadeMacro quantidadeMacro;

  public Alimento() {
  }

  public Alimento(String nome, List<Nutriente> nutriente, QuantidadeMacro quantidadeMacro) {
    this.nome = nome;
    this.nutriente = nutriente;
    this.quantidadeMacro = quantidadeMacro;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Nutriente> getNutriente() {
    return nutriente;
  }

  public void setNutriente(List<Nutriente> nutriente) {
    this.nutriente = nutriente;
  }

  public QuantidadeMacro getQuantidadeMacro() {
    return quantidadeMacro;
  }

  public void setQuantidadeMacro(QuantidadeMacro quantidadeMacro) {
    this.quantidadeMacro = quantidadeMacro;
  }
}
