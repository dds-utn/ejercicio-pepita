package ar.edu.utn.frba.dds.pepita;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GolondrinaTest {

  @Test
  public void siComeAumentaSuEnergia() {
    Golondrina pepita = new Golondrina(40);
    pepita.comer(23);
    Assertions.assertEquals(109, pepita.getEnergia());
  }

  @Test
  public void siVuelaDecrementaSuEnergia() {
    Golondrina pepita = new Golondrina(40);
    pepita.comer(23);
    pepita.volar();
    Assertions.assertEquals(99, pepita.getEnergia());
  }
}