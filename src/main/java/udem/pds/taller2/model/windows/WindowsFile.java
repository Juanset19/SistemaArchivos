/**
 * 
 */
package udem.pds.taller2.model.windows;

import java.util.Date;

import udem.pds.taller2.model.File;

/**
 * Clase que representa un archivo del SO Linux
 */
public class WindowsFile extends File {

	/**
	 * Constructor de un archivo Windows
	 * 
	 * @param name
	 *            - nombre del recurso
	 * @param modificationDate
	 *            - fecha de última modificación
	 * @param type
	 *            - Tipo de archivo
	 */
	public WindowsFile(String name, Date modificationDate, String type) {
		super(name, modificationDate, type);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see udem.pds.taller2.model.File#copy()
	 */
	@Override
	public void copy() {
		System.out.println("Copiando un archivo Windows");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see udem.pds.taller2.model.File#delete()
	 */
	@Override
	public void delete() {
		System.out.println("Borrando un archivo Windows");
	}

}
