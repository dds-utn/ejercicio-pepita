package ar.edu.utn.frba.dds.pepita;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class GolondrinaTest {

  @Test
  public void siComeAumentaSuEnergia() {
    Golondrina pepita = new Golondrina(40);
    pepita.comer(23);
    Assert.assertEquals(109, pepita.getEnergia());
  }

  @Test
  public void siVuelaDecrementaSuEnergia() {
    Golondrina pepita = new Golondrina(40);
    pepita.comer(23);
    pepita.volar();
    Assert.assertEquals(99, pepita.getEnergia());
  }
}