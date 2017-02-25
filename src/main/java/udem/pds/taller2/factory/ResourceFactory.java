/**
 * 
 */
package udem.pds.taller2.factory;

import java.util.Date;

import udem.pds.taller2.model.Resource;

/**
 * Clase que representa una fábrica de recursos. En esta clase se delega la creación de recursos, liberando de la responsabilidad a la clase
 * FileSystem
 */
public abstract class ResourceFactory {

	/**
	 * Constructor de la fábrica
	 */
	public ResourceFactory() {
		super();
	}

	/**
	 * Obtiene una fábrica de acuerdo al sistema operativo que use la aplicación
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
	 *            - fecha de última modificación
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
	 *            - fecha de última modificación
	 * @return Folder resoruce
	 */
	public abstract Resource getFolderResource(String name, Date modificationDate);

}
