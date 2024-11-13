package GIIN21;

/**
 * Clase que gestiona las finanzas de la empresa.
 * Concepto aplicado: Encapsulamiento
 * Información adicional: Podemos acceder a las variables privadas a través de métodos públicos de la clase
 */
public class Finanzas {
 // Atributos privados de la clase Finanzas 
 private double ingresos;
 private double gastos;

 /**
 * Constructor para crear un objeto de Finanzas.
 * @param ingresos Ingresos de la empresa.
 * @param gastos Gastos de la empresa.
 */
 public Finanzas(double ingresos, double gastos) {
 this.ingresos = ingresos;
 this.gastos = gastos;
 }

 // Métodos getter y setter para los atributos 
 public double getIngresos() {
 return ingresos;
 }

 // Métodos getter y setter para los atributos 
 public void setIngresos(double ingresos) {
 this.ingresos = ingresos;
 }

 // Métodos getter y setter para los atributos 
 public double getGastos() {
 return gastos;
 }

 // Métodos getter y setter para los atributos 
 public void setGastos(double gastos) {
 this.gastos = gastos;
 }

 /**
 * Calcula el beneficio neto de la empresa.
 * @return Beneficio neto.
 */
 public double calcularBeneficioNeto() {
 return ingresos - gastos;
 }
}