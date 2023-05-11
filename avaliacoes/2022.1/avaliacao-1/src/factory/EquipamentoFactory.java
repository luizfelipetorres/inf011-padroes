package factory;

import model.Equipamento;

interface EquipamentoFactory {
  Equipamento criarEquipamento(String identificador, int quantidade);

}
