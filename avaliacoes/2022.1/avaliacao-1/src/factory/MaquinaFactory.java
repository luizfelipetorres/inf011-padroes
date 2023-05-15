package factory;

import model.Maquina;

public class MaquinaFactory implements EquipamentoFactory<Maquina> {

  @Override
  public Maquina criarEquipamento(String identificador, int quantidade) {
    return new Maquina(identificador, quantidade);
  }
}
