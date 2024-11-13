package GIIN21;

/**
 * Clase que gestiona las operaciones de inventario.
 * Concepto aplicado: Encapsulamiento
 * Información adicional: No permitimos acceder desde fuera de clase a ciertos métodos de la clase, pero si los métodos que son públicos sí los pueden utilizar
 */
public class Operaciones 
{

 /**
 * Permite recuperar el stock del producto.
 */
 private int recuperarStock() 
 {
  return BaseDatosSimulada.Stock;
 }
	
/**
 * Realiza un pedido reduciendo el stock del producto.
 * @param producto Producto a pedir.
 * @param cantidad Cantidad a reducir del stock.
 */
 public void realizarPedido(Producto producto, int cantidad) throws Exception
 {
  //Comprobamos si hay stock disponible antes de realizar el pedido
  if (this.recuperarStock() >=cantidad)
  {
	  this.actualizarStock(cantidad);
  }
  else
  {
	  //Lanzamos una excepción genérica que capturaremos en el main
	  throw new Exception("No hay stock sufiente para hacer el pedido");
  }
 }

 /**
 * Actualiza el stock del producto después de que se realiza un pedido.
 * @param producto Producto a actualizar.
 * @param cantidad Cantidad a añadir al stock.
 */
 public void actualizarStock(int cantidad) {
  BaseDatosSimulada.Stock -= cantidad;
 }
}

