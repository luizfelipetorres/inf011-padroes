package factory;

import model.Halteres;

public class HalterFactory implements EquipamentoFactory<Halteres> {

  @Override
  public Halteres criarEquipamento(String identificador, int quantidade) {
    return new Halteres(identificador, quantidade);
  }
}
