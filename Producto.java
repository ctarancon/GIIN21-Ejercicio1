package GIIN21;

/**
 * Clase que representa un producto en el inventario, producto.
 * Concepto aplicado: Encapsulamiento
 * Información adicional: Podemos acceder a las variables privadas a través de métodos públicos de la clase
 */
public class Producto {
 // Atributos de la clase Producto;
 private double precio;
 private int stock;
 private String nombre;

 /**
 * Constructor para crear un producto.
 * @param nombre Nombre del producto.
 * @param precio Precio del producto.
 * @param stock Cantidad en stock del producto.
 */
 public Producto(String nombre, double precio, int stock) {
	 this.nombre = nombre;
	 this.precio = precio;
	 BaseDatosSimulada.Stock += stock;
	 this.stock = BaseDatosSimulada.Stock;
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
 public double getPrecio() {
 return precio;
 }

 // Métodos getter y setter para los atributos 
 public void setPrecio(double precio) {
 this.precio = precio;
 }

 // Métodos getter y setter para los atributos 
 public int getStock() {
 return stock;
 }

 // Métodos getter y setter para los atributos 
 public void setStock(int stock) {
 this.stock = stock;
 }

 /**
 * Actualiza el stock del producto.
 * @param cantidad Cantidad a ajustar en el stock.
 */
 public void actualizarStock(int cantidad) {
	 BaseDatosSimulada.Stock += cantidad;
 }

 /**
 * Calcula el valor total del inventario del producto.
 * @return Valor total del inventario.
 */
 public double calcularValorInventario() {
 return precio * stock;
 }

 /**
 * Describe el producto.
 * @return Descripción del producto.
 */
 public String describirProducto() {
 return "Producto: " + nombre + ", Precio: " + precio;
 }
}