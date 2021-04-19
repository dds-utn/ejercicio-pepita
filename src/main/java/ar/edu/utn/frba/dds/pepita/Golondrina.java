package ar.edu.utn.frba.dds.pepita;

public class Golondrina {
  private int energia;

  public Golondrina(int energia) {
    this.energia = energia;
  }

  public void volar() {
    energia -= 10;
  }

  public void comer(int alpiste) {
    energia += alpiste * 3;
  }

  public int getEnergia() {
    return energia;
  }
}
