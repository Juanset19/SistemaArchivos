/**
 * 
 */
package udem.pds.taller2.model.linux;

import java.util.Date;

import udem.pds.taller2.model.File;

/**
 * Clase que representa un archivo del SO Linux
 */
public class LinuxFile extends File {

	/**
	 * Constructor de un archivo Linux
	 * 
	 * @param name
	 *            - nombre del recurso
	 * @param modificationDate
	 *            - fecha de última modificación
	 * @param type
	 *            - Tipo de archivo
	 */
	public LinuxFile(String name, Date modificationDate, String type) {
		super(name, modificationDate, type);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see udem.pds.taller2.model.File#copy()
	 */
	@Override
	public void copy() {
		System.out.println("Copiando un archivo Linux");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see udem.pds.taller2.model.File#delete()
	 */
	@Override
	public void delete() {
		System.out.println("Borrando un archivo Linux");
	}

}
