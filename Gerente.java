
package GIIN21;

/**
 * Clase que representa a un gerente, heredando de Empleado.
 * Concepto aplicado: Polimorfismo, herencia, encapsulamiento
 * Información adicional: Heredamos de empleado y sobreescribimos el método calcularSalario de la clase padre.Podemos acceder a las variables privadas a través de métodos públicos de la clase
 */
public class Gerente extends Empleado {
 // Atributos específicos de la clase Gerente 
 private String departamento;
 private double bono;

 /**
 * Constructor para crear un gerente.
 * @param nombre Nombre del gerente.
 * @param id Identificación del gerente.
 * @param salario Salario base del gerente.
 * @param departamento Departamento del gerente.
 * @param bono Bono adicional del gerente.
 */
 public Gerente(String nombre, int id, double salario, String departamento, double bono) {
 super(nombre, id, salario);
 this.departamento = departamento;
 this.bono = bono;
 }

 // Métodos getter y setter para los atributos específicos 
 public String getDepartamento() {
 return departamento;
 }

 // Métodos getter y setter para los atributos específicos 
 public void setDepartamento(String departamento) {
 this.departamento = departamento;
 }

 /**
 * Calcula el salario total del gerente, incluyendo el bono.
 * 1. Sobreescribimos el método de la clase padre.
 * 2. Invocamos al método de la clase padre y agregamos información adicional
 * @return Salario total del gerente.
 */
 @Override public double calcularSalario() {
 return super.calcularSalario() + bono;
 }
}

