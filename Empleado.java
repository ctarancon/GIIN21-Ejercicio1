package GIIN21;

/**
 * Clase que representa a un empleado en la empresa. 
 * Concepto aplicado: Encapsulamiento
 * Información adicional: Podemos acceder a las variables privadas a través de métodos públicos de la clase
 */

public class Empleado {
 // Atributos de la clase Empleado private String nombre;
 private int id;
 private double salario;
 private String nombre;

 /**
 * Constructor para crear un empleado.
 * @param nombre Nombre del empleado.
 * @param id Identificación del empleado.
 * @param salario Salario del empleado.
 */
 public Empleado(String nombre, int id, double salario) {
 this.nombre = nombre;
 this.id = id;
 this.salario = salario;
 }

 // Métodos getter y setter para los atributos 
 public String getNombre() {
 return nombre;
 }

  // Métodos getter y setter para los atributos 
 public void setNombre(String nombre) {
 this.nombre = nombre;
 }

  // Métodos getter y setter para los atributos 
 public int getId() {
 return id;
 }

  // Métodos getter y setter para los atributos 
 public void setId(int id) {
 this.id = id;
 }

  // Métodos getter y setter para los atributos 
 public double getSalario() {
 return salario;
 }

  // Métodos getter y setter para los atributos 
 public void setSalario(double salario) {
 this.salario = salario;
 }

 /**
 * Ajustamos el salario del empleado ajustándolo de USD a EUROS.
 * @return Salario del empleado.
 */
 public double calcularSalario() {
 return salario * Constantes.constFactorEUR;
 }
}
