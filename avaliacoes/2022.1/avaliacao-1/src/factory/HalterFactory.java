package factory;

import model.Equipamento;
import model.Halteres;

public class HalterFactory implements EquipamentoFactory {

  @Override
  public Equipamento criarEquipamento(String identificador, int quantidade) {
    return new Halteres(identificador, quantidade);
  }
}
