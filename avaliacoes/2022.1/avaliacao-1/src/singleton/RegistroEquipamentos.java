package singleton;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import factory.EquipamentoFactory;
import model.Equipamento;

public class RegistroEquipamentos {

  private static RegistroEquipamentos instance = null;
  private final Map<String, Equipamento> equipamentos;
  private final Map<String, EquipamentoFactory> factories;

  private RegistroEquipamentos(String filePath)
      throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
    equipamentos = new HashMap<>();
    factories = new HashMap<>();
    configureFactories(filePath);
  }

  private static EquipamentoFactory createFactory(String className)
      throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException {
    return (EquipamentoFactory) Class
        .forName(className)
        .getConstructor()
        .newInstance();

  }

  public static RegistroEquipamentos getInstance(String filePath)
      throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
    return instance == null ? instance = new RegistroEquipamentos(filePath) : instance;
  }

  private void configureFactories(String filePath)
      throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
    Properties props = new Properties();
    props.load(new FileReader(filePath));
    for (Object prop : props.keySet()) {
      String key = (String) prop;
      String classname = props.getProperty(key);
      factories.put(key, createFactory(classname));
    }
  }

  public void registrarEquipamento(String tipo, String identificador, Integer quantidade) {
    EquipamentoFactory<?> factory = factories.get(tipo);
    if (equipamentos.containsKey(identificador)) {
      equipamentos
          .get(identificador)
          .incrementarQuantidade(quantidade);
    } else {
      Equipamento novo = factory.criarEquipamento(identificador, quantidade);
      equipamentos.put(identificador, novo);
    }
  }

  public Equipamento getEquipamento(String chave) {
    return equipamentos.get(chave);
  }

}
