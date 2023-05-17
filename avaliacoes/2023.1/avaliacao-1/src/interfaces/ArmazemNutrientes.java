package interfaces;

import exception.NutrienteNaoEncontradoException;
import model.Nutriente;

public interface ArmazemNutrientes {
  Nutriente create(String nome, String unidade, Double caloriaPorUnidade);
  Nutriente create(String nome) throws NutrienteNaoEncontradoException;
}
