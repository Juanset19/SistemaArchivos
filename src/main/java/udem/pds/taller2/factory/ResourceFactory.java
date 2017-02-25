/**
 * 
 */
package udem.pds.taller2.factory;

import java.util.Date;

import udem.pds.taller2.model.Resource;

/**
 * Clase que representa una f�brica de recursos. En esta clase se delega la creaci�n de recursos, liberando de la responsabilidad a la clase
 * FileSystem
 */
public abstract class ResourceFactory {

	/**
	 * Constructor de la f�brica
	 */
	public ResourceFactory() {
		super();
	}

	/**
	 * Obtiene una f�brica de acuerdo al sistema operativo que use la aplicaci�n
	 * 
	 * @return ResourceFactory
	 */
	public static ResourceFactory getFactory() {
		String os = System.getProperty("os.name");
		if (os.startsWith("Windows")) {
			return new WindowsResourceFactory();
		} else if (os.startsWith("Linux")) {
			return new LinuxResourceFactory();
		} else {
			return null;
		}
	}

	/**
	 * Crea un archivo
	 * 
	 * @param name
	 *            - nombre del recurso
	 * @param modificationDate
	 *            - fecha de �ltima modificaci�n
	 * @param type
	 *            - Tipo de archivo
	 * @return File resource
	 */
	public abstract Resource getFileResource(String name, Date modificationDate, String type);

	/**
	 * Crea una carpeta
	 * 
	 * @param name
	 *            - nombre del recurso
	 * @param modificationDate
	 *            - fecha de �ltima modificaci�n
	 * @return Folder resoruce
	 */
	public abstract Resource getFolderResource(String name, Date modificationDate);

}
