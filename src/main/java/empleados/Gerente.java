package empleados;

import java.time.LocalDate;
import java.util.Date;

public class Gerente extends Empleado {
  private String departamento;

  public Gerente(String nombre, double sueldoBasico, LocalDate fechaDeNacimiento, String departamento) {
    super(nombre, sueldoBasico, fechaDeNacimiento);
    this.departamento = departamento;
  }

  public Gerente(String nombre, double sueldoBasico, String departamento) {
    this(nombre, sueldoBasico,null,departamento);
  }

  public Gerente(String nombre) {
    this(nombre,0,null,null);
  }

  public Gerente() {
    this(null);
  }

  @Override
  public double getSueldoBasico() {
    return super.sueldoBasico * 1.2;
  }

  public String getDepartamento() {
    return this.departamento;
  }
}
