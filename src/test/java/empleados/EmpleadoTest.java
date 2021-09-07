package empleados;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class EmpleadoTest {
  @Test
  public void creoUnEmpleadoPorDefaultTest() {
    Empleado juan = new Empleado();
    assertNull(juan.getNombre());
    assertEquals(0.00, juan.getSueldoBasico(), 0.001);
    assertNull(juan.getFechaDeNacimiento());
  }

  @Test
  public void creoUnEmpleadoParametrizadoTest() {
    Empleado ana = new Empleado("Ana", 68000, LocalDate.of(1995, 3, 23));
    assertEquals("Ana", ana.getNombre());
    assertEquals(68000, ana.getSueldoBasico(), 0.001);
    LocalDate esperada = LocalDate.of(1995, 3, 23);
    assertEquals(esperada, ana.getFechaDeNacimiento()  );
  }

  @Test
  public void creoUnGerentePorDefault() {
    Gerente pablo = new Gerente();
    assertNull(pablo.getNombre());
    assertEquals(0, pablo.getSueldoBasico(), 0.001);
    assertNull(pablo.getFechaDeNacimiento());
    assertNull(pablo.getDepartamento());
  }

  @Test
  public void creoUnGerenteParametrizadoTest() {
    Gerente julia = new Gerente("Julia", 68000, LocalDate.of(1980, 6, 20), "Produccion");
    assertEquals("Julia", julia.getNombre());
    assertEquals(68000 * 1.2, julia.getSueldoBasico(), 0.01);
    LocalDate esperada = LocalDate.of(1980, 6, 20);
    assertEquals(esperada, julia.getFechaDeNacimiento());
    assertEquals("Produccion", julia.getDepartamento());

    Gerente raul = new Gerente("Raul", 250000, "Informatica");
    assertEquals(250000 * 1.2, raul.getSueldoBasico(), 0);

    Gerente paula = new Gerente("Paula");
    assertEquals(0, paula .getSueldoBasico(), 0);

  }


}