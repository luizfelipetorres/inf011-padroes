package builder;

import interfaces.Builder;
import model.Alimento;
import model.FichaNutricional;

public class FichaNutricionalBuilder implements Builder {



  @Override
  public Builder isLowCarb(boolean b) {
    return this;
  }

  @Override
  public Builder isVegano(boolean b) {
    return this;
  }

  @Override
  public Builder isSemLactose(boolean b) {
    return this;
  }

  @Override
  public Builder isSemGlutem(boolean b) {
    return this;
  }

  @Override
  public Builder isReduzidoSodio(boolean b) {
    return this;
  }

  @Override
  public Builder comoFazer(String modo) {
    return this;
  }

  @Override
  public Builder reset() {
    return this;
  }

  @Override
  public Builder comAlimento(Alimento a) {
    return this;
  }

  public FichaNutricional imprimir(){
    //Abstrato
    return new FichaNutricional(1, 1, 1);
  }
}
