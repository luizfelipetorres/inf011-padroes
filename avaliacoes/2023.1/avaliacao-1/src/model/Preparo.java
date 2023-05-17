package model;

import java.util.List;

public class Preparo {

  private String nome;
  private boolean lowCarb;
  private boolean vegano;
  private boolean semLactose;
  private boolean semGluten;
  private boolean reduzidoSodio;
  private String modoDeFazer;
  private List<Alimento> alimentos;

  public Preparo() {
  }

  public Preparo(String nome, boolean lowCarb, boolean vegano, boolean semLactose,
                 boolean semGluten,
                 boolean reduzidoSodio, String modoDeFazer, List<Alimento> alimentos) {
    this.nome = nome;
    this.lowCarb = lowCarb;
    this.vegano = vegano;
    this.semLactose = semLactose;
    this.semGluten = semGluten;
    this.reduzidoSodio = reduzidoSodio;
    this.modoDeFazer = modoDeFazer;
    this.alimentos = alimentos;
  }

  public List<Alimento> getAlimentos() {
    return alimentos;
  }

  public void setAlimentos(List<Alimento> alimentos) {
    this.alimentos = alimentos;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public boolean isLowCarb() {
    return lowCarb;
  }

  public void setLowCarb(boolean lowCarb) {
    this.lowCarb = lowCarb;
  }

  public boolean isVegano() {
    return vegano;
  }

  public void setVegano(boolean vegano) {
    this.vegano = vegano;
  }

  public boolean isSemLactose() {
    return semLactose;
  }

  public void setSemLactose(boolean semLactose) {
    this.semLactose = semLactose;
  }

  public boolean isSemGluten() {
    return semGluten;
  }

  public void setSemGluten(boolean semGluten) {
    this.semGluten = semGluten;
  }

  public boolean isReduzidoSodio() {
    return reduzidoSodio;
  }

  public void setReduzidoSodio(boolean reduzidoSodio) {
    this.reduzidoSodio = reduzidoSodio;
  }

  public String getModoDeFazer() {
    return modoDeFazer;
  }

  public void setModoDeFazer(String modoDeFazer) {
    this.modoDeFazer = modoDeFazer;
  }
}
