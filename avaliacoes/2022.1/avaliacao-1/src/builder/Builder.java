package builder;

import model.TipoExcercicio;

public interface Builder<T> {

  Builder<T> doTipo(TipoExcercicio tipoExcercicio);

  Builder<T> paraOGrupoMuscular(String grupoMuscular);

  Builder<T> resetar(String nome);

  T build();
}
