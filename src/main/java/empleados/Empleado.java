package empleados;

import java.time.LocalDate;
import java.util.Date;

public class Empleado {
  protected String nombre;
  protected double sueldoBasico;
  protected LocalDate fechaDeNacimiento;


  public Empleado(String nombre, double sueldoBasico, LocalDate fechaDeNacimiento) {
    this.nombre = nombre;
    this.sueldoBasico = sueldoBasico;
    this.fechaDeNacimiento = fechaDeNacimiento;
  }

  public Empleado(String nombre, double sueldoBasico) {
    this(nombre,sueldoBasico,null);
  }

  public Empleado(String nombre) {
    this(nombre,0);
  }

  public Empleado() {
    this(null);
  }

  public String getNombre() {
    return this.nombre;
  }

  public double getSueldoBasico() {
    return this.sueldoBasico;
  }

  public LocalDate getFechaDeNacimiento() {
    return this.fechaDeNacimiento;
  }
}
