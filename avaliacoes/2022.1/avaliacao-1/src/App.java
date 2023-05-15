import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import model.Excercicio;
import model.TipoExcercicio;
import singleton.RegistroEquipamentos;

public class App {

  public static void main(String[] args)
      throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
    RegistroEquipamentos registro = RegistroEquipamentos.getInstance("factories.properties");
    registro.registrarEquipamento("MAQUINA", "ABC", 1);
    System.out.println(registro.getEquipamento("ABC"));

    Excercicio build = Excercicio
        .builder("Supino")
        .paraOGrupoMuscular("Peito")
        .paraOGrupoMuscular("Braço")
        .doTipo(TipoExcercicio.RESISTIDO)
        .build();

    System.out.println(build);
  }
}
