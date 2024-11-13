package GIIN21;

/**
 * Clase que representa un café especial, heredando de Producto.
 * Concepto aplicado: Polimorfismo, herencia, encapsulamiento
 * Información adicional: Heredamos de la clase producto y sobreescribimos el método describirProducto de la clase padre. Podemos acceder a las variables privadas a través de métodos públicos de la clase
 */
public class CafeEspecial extends Producto {
//Atributos específicos de la clase CafeEspecial 
 private String origen;
 private String notaDeCata;

/**
 * Constructor para crear un café especial.
 * @param nombre Nombre del café.
 * @param precio Precio del café.
 * @param stock Cantidad en stock del café.
 * @param origen Origen del café.
 * @param notaDeCata Nota de cata del café.
 */
 public CafeEspecial(String nombre, double precio, int stock, String origen, String notaDeCata) {
 super(nombre, precio, stock);
 this.origen = origen;
 this.notaDeCata = notaDeCata;
 }

 // Métodos getter y setter para los atributos específicos 
 public String getOrigen() {
 return origen;
 }

//Métodos getter y setter para los atributos específicos 
 public void setOrigen(String origen) {
 this.origen = origen;
 }

//Métodos getter y setter para los atributos específicos 
 public String getNotaDeCata() {
 return notaDeCata;
 }

//Métodos getter y setter para los atributos específicos 
 public void setNotaDeCata(String notaDeCata) {
 this.notaDeCata = notaDeCata;
 }

 /**
 * Describe el café especial. 
 * 1. Sobreescribimos el método de la clase padre.
 * 2. Invocamos al método de la clase padre y agregamos información adicional
 * @return Descripción del café especial.
 */
 @Override public String describirProducto() {
 return super.describirProducto() + ", Origen: " + origen + ", Nota de Cata: " + notaDeCata;
 }
}

