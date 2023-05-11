package factory;

import model.Equipamento;
import model.Maquina;

public class MaquinaFactory implements EquipamentoFactory{

  @Override
  public Equipamento criarEquipamento(String identificador, int quantidade) {
    return new Maquina(identificador, quantidade);
  }
}
