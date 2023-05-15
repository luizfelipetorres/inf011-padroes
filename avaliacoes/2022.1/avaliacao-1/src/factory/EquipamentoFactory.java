package factory;

import model.Equipamento;

public interface EquipamentoFactory<T extends Equipamento> {

  T criarEquipamento(String identificador, int quantidade);

}
