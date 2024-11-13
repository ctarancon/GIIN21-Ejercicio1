/**
 * Parquete por defecto para almacenar los ejercicios de la clase GIIN21
 */
package GIIN21;

/**
 * Clase que contiene el método main y controla las posibles excepciones del programa
 */
public class Launcher {

	static boolean trazabilidadExcepcion;
	/**
	 * @param args Sin uso inicialmente
	 */
	public static void main(String[] args) {
		Launcher.simulacionEjecucion();
	}
	
	/**
	 * Método para comprobar empíricamente los conceptos aplicados
	 */
	public static void simulacionEjecucion()
	{
		// Controlamos las posibles excepciones
			try
			{
				Launcher.trazabilidadExcepcion = false;
				//Iniciamos la ejecución de nuestro programa
				Launcher.muestraMensaje("Iniciamos comprobación empírica de conceptos.");
				//1. Instanciamos las clases empleado y gerente
				Empleado empleadoUno = new Empleado("Carlos", 100, 1000);
				Launcher.muestraMensaje("Se ha creado: " + empleadoUno.getNombre() + " con el siguiente sueldo: " + empleadoUno.calcularSalario());
				//2. El método calcular salario de la clase gerente sobrescribe al de la clase empleado y le adicionalmente le añade el bono
				Gerente gerenteUno = new Gerente("Pedro", 50, 1000, "Departamento finanzas", 500);
				Launcher.muestraMensaje("Se ha creado: " + gerenteUno.getNombre() + " con el siguiente sueldo y bono: " + gerenteUno.calcularSalario());
				//3. Instanciamos producto, cafeEspecial
				Producto productoUno = new Producto("Café normal", 10, 500);
				Launcher.muestraMensaje("Se ha creado el producto: " + productoUno.describirProducto());
				//4. El método describirProducto de la clase cafeespecial añadiendo origen y nota de cata
				CafeEspecial cafeEspecialUno = new CafeEspecial("Café especial 1", 15, 200, "Colombia", "Sabor afrutado");
				Launcher.muestraMensaje("Se ha creado el producto: " + cafeEspecialUno.describirProducto());
				//5. Instanciamos clases
				Operaciones operacionVentaUno = new Operaciones();
				//6. Hacemos un pedido de un producto
				operacionVentaUno.realizarPedido(productoUno,150);
				//7. Mostramos beneficio neto
				Finanzas finanzasUno = new Finanzas(15000, 10000);
				Launcher.muestraMensaje("El beneficio de la empresa es de: " + finanzasUno.calcularBeneficioNeto());
					
			}
			catch (Exception e)
			{
				Launcher.trazabilidadExcepcion = true;
				Launcher.muestraMensaje("Excepción genérica detectada en tiempo de ejecución:" + e.getMessage());
			}
			finally
			{
				//Informamos al usuario si el programa tuvo alguna excepción durante su ejecución
				if(Launcher.trazabilidadExcepcion == false)
				{
					Launcher.muestraMensaje("El programa se ejecutó y no se detectaron excepciones.");
				}
				else 
				{
					Launcher.muestraMensaje("El programa se ejecutó y se detectaron excepciones las cuales fueron capturadas y registradas.");
				}
			}
	}
	
	/**
	 * Método utilidad para mostrar los mensajes
	 */
	public static void muestraMensaje (String msg)
	{
		System.out.println(msg);
	}
	
}
