/**
 * 
 */
package udem.pds.taller2.model;

import java.util.Date;

/**
 * Clase que representa un recurso (Archivo o carpeta) de un sistema de archivos.
 *
 */
public abstract class Resource {

	/**
	 * Nombre del recurso
	 */
	protected String name;

	/**
	 * Fecha de última modificación
	 */
	protected Date modificationDate;

	/**
	 * Constructor de la clase abstracta, que obliga a que las subclases específiquen como se deben crear
	 * 
	 * @param name
	 *            - nombre del recurso
	 * @param modificationDate
	 *            - fecha de última modificación
	 */
	public Resource(String name, Date modificationDate) {
		super();
		this.name = name;
		this.modificationDate = modificationDate;
	}

	/**
	 * Método para copiar el recurso
	 */
	public abstract void copy();

	/**
	 * Método para eliminar el recurso
	 */
	public abstract void delete();

}
