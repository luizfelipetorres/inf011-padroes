package factory;

import model.Acessorio;
import model.Equipamento;

public class AcessorioFactory implements EquipamentoFactory{

  @Override
  public Equipamento criarEquipamento(String identificador, int quantidade) {
    return new Acessorio(identificador, quantidade);
  }
}
