/**
 * 
 */
package udem.pds.taller2.model;

import java.util.Date;

/**
 * Clase que representa una archivo en un sistema de archivos
 *
 */
public abstract class File extends Resource {

	/**
	 * Atributo que determina que tipo de archivo representa una instancia de esta clase
	 */
	protected String type;

	/**
	 * Constructor de un archivo
	 * 
	 * @param name
	 *            - nombre del recurso
	 * @param modificationDate
	 *            - fecha de última modificación
	 * @param type
	 *            - Tipo de archivo
	 */
	public File(String name, Date modificationDate, String type) {
		super(name, modificationDate);
		this.type = type;
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
