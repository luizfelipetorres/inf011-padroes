package builder;

import java.util.ArrayList;
import java.util.List;

import interfaces.Builder;
import model.Alimento;
import model.Preparo;

public class PreparoBuilder implements Builder {
  private String nome;
  private boolean lowCarb;
  private boolean vegano;
  private boolean semLactose;
  private boolean semGluten;
  private boolean reduzidoSodio;
  private String modoDeFazer;
  private List<Alimento> alimentos;

  public PreparoBuilder(String nome) {
    this.nome = nome;
    lowCarb = false;
    vegano = false;
    semGluten = false;
    semLactose = false;
    reduzidoSodio = false;
    modoDeFazer = "";
    alimentos = new ArrayList<>();
  }

  @Override
  public Builder isLowCarb(boolean b) {
    lowCarb = b;
    return this;
  }

  @Override
  public Builder isVegano(boolean b) {
    vegano = b;
    return this;
  }

  @Override
  public Builder isSemLactose(boolean b) {
    semLactose = b;
    return this;
  }

  @Override
  public Builder isSemGlutem(boolean b) {
    semGluten =b;
    return this;
  }

  @Override
  public Builder isReduzidoSodio(boolean b) {
    reduzidoSodio = b;
    return this;
  }

  @Override
  public Builder comoFazer(String modo) {
    modoDeFazer = modo;
    return this;
  }

  @Override
  public Builder reset() {
    this.nome = nome;
    lowCarb = false;
    vegano = false;
    semGluten = false;
    semLactose = false;
    reduzidoSodio = false;
    modoDeFazer = "";
    alimentos = new ArrayList<>();
    return this;
  }

  @Override
  public Builder comAlimento(Alimento a) {
    alimentos.add(a);
    return this;
  }

  public Preparo prepar(){
    return new Preparo(nome, lowCarb, vegano, semLactose, semGluten, reduzidoSodio, modoDeFazer, alimentos);
  }
}
