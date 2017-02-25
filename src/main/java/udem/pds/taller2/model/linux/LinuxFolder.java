/**
 * 
 */
package udem.pds.taller2.model.linux;

import java.util.Date;

import udem.pds.taller2.model.Folder;

/**
 * Representa una carpeta en el SO Linux
 */
public class LinuxFolder extends Folder {

	/**
	 * Constructor de una carpeta Linux
	 * 
	 * @param name
	 *            - nombre del recurso
	 * @param modificationDate
	 *            - fecha de última modificación
	 */
	public LinuxFolder(String name, Date modificationDate) {
		super(name, modificationDate);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see udem.pds.taller2.model.Folder#copy()
	 */
	@Override
	public void copy() {
		System.out.println("Copiando una carpeta Linux");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see udem.pds.taller2.model.Folder#delete()
	 */
	@Override
	public void delete() {
		System.out.println("Borrando una carpeta Linux");
	}

}
