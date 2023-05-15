package factory;

import model.Acessorio;

public class AcessorioFactory implements EquipamentoFactory<Acessorio> {

  @Override
  public Acessorio criarEquipamento(String identificador, int quantidade) {
    return new Acessorio(identificador, quantidade);
  }
}
