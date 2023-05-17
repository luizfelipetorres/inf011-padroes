package singleton;

import java.util.HashMap;
import java.util.Map;

import exception.NutrienteNaoEncontradoException;
import interfaces.ArmazemNutrientes;
import model.Nutriente;

public class CatalogoNutrientes implements ArmazemNutrientes {

  private static CatalogoNutrientes instance = null;
  private Map<String, Nutriente> catalogo;

  private CatalogoNutrientes() {
    catalogo = new HashMap<>();
  }

  public static CatalogoNutrientes getInstance() {
    if (instance == null) {
      instance = new CatalogoNutrientes();
    }
    return instance;
  }


  @Override
  public Nutriente create(String nome, String unidade, Double caloriaPorUnidade) {
    Nutriente n;
    if (catalogo.containsKey(nome)) {
      n = catalogo.get(nome);
      n.setCaloriaPorUnidade(caloriaPorUnidade);
      n.setUnidade(unidade);
      return n;
    }
    n = new Nutriente(nome, unidade, caloriaPorUnidade);
    catalogo.put(nome, n);
    return n;
  }

  @Override
  public Nutriente create(String nome) throws NutrienteNaoEncontradoException {
    if (!catalogo.containsKey(nome)) {
      throw new NutrienteNaoEncontradoException();
    }
    return catalogo.get(nome);
  }
}
