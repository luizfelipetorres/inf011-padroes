package singleton;

import java.util.HashMap;
import java.util.Map;

import model.Curso;

public class CatalogoCursos {

  private static CatalogoCursos instance = null;
  private Map<String, Curso> registroCursos;

  private CatalogoCursos() {
    registroCursos = new HashMap<>();
  }

  public static CatalogoCursos getInstance() {
    return instance == null
        ? instance = new CatalogoCursos()
        : instance;
  }

  public void registrar(Curso curso) {
    registroCursos.put(curso.getNome(), curso);
  }

  public Curso recuperarCopia(String nomeRegistro) {
    if (registroCursos.containsKey(nomeRegistro)) {
      return registroCursos
          .get(nomeRegistro)
          .clone();
    }
    System.err.println("Registro não encontrado!");
    return null;

  }

}
