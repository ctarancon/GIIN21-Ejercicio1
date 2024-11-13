package GIIN21;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/** 
* Clase que simula una BBDD simple con ficheros XML y variables estáticas
* Concepto aplicado: Polimorfismo
* Información adicional: Polimorfismo del constructor por defecto de la clase BaseDatosSimulada
*/
public class BaseDatosSimulada {

	String pathXML;
	boolean sobreEscribir;
	
	//Agrego una variable estática para simular el stock durante la ejecución del programa
	public static int Stock = 100;
	
	//Constructor por defecto de la clase, si no lo agrego yo igual se crea por defecto
	public BaseDatosSimulada()
	{
		//No hago nada por defecto
	}
	
	/** Polimorfismo del constructor por defecto de la clase BaseDatosSimulada
	*@param path Ruta del fichero XML
	*@param overwrite Valor binario que indica si se debe sobreescribir el archivo si llegáramos a crear uno nuevo, en este caso no aplica puesto que utilizamos siempre el mismo
	*
	*/
	public BaseDatosSimulada(String path, boolean overwrite)
	{
		pathXML = path;
		sobreEscribir = overwrite;
	}
	
	/**
	 * Método que abre un fichero XML y devuelve un conjunto de nodos como string en base a una expresión objetivo.
	 * @param expresionObjetivo Expresión a buscar en el fichero XML.
	 */
	public String buscarSueldoBBDD(String expresionObjetivo) throws Exception 
	{
		//Comprobamos si tenemos la ruta del fichero XML
		if (pathXML == null)
		{
			//Asignamos el fichero XML por defecto
			pathXML = Constantes.constFicheroXML;
		}
		try
		{
			//Creamos los objetos necesarios para el tratamiento del documento XML
			File ficheroXML = new File(pathXML);
		    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		    Document documentoXML = dBuilder.parse(ficheroXML);
		    documentoXML.getDocumentElement().normalize();
		    XPath manejadorXML = XPathFactory.newInstance().newXPath();
		    NodeList nodeList = (NodeList) manejadorXML.compile(expresionObjetivo).evaluate(documentoXML, XPathConstants.NODESET);
		    
		    //Recorremos el conjunto de nodos del fichero XML y buscamos la información deseada, en este caso el sueldo por ejemplo
		    for (int i = 0; i < nodeList.getLength();) 
		    {
		        Node nodos = nodeList.item(i);
		        if (nodos.getNodeType() == Node.ELEMENT_NODE) 
		        {
		          Element eElement = (Element) nodos;
		           	return eElement.getElementsByTagName(Constantes.constNombreNodoSueldoXML).item(0).getTextContent();
		        }
		    }
		}
		catch (ParserConfigurationException e)
		{
			//Convertimos la excepción específica de parseos a una excepción genérica y la capturamos en el main
			throw new Exception(e.getMessage());
		}
		catch (SAXException e)
		{
			//Convertimos la excepción específica de manejo XML a una excepción genérica y la capturamos en el main
			throw new Exception(e.getMessage());
		}
		catch (IOException e)
		{
			//Convertimos la excepción específica de manejos de ficheros a una excepción genérica y la capturamos en el main
			throw new Exception(e.getMessage());
		}
		return "Registro no encontrado";
	}
		
}
