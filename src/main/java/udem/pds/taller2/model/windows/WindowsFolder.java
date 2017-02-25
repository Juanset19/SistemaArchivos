/**
 * 
 */
package udem.pds.taller2.model.windows;

import java.util.Date;

import udem.pds.taller2.model.Folder;

/**
 * Representa una carpeta en el SO Windows
 */
public class WindowsFolder extends Folder {

	/**
	 * Constructor de una carpeta Windows
	 * 
	 * @param name
	 *            - nombre del recurso
	 * @param modificationDate
	 *            - fecha de última modificación
	 *            @param children
	 *            - Archivos y subcarpetas contenidas
	 */
	public WindowsFolder(String name, Date modificationDate) {
		super(name, modificationDate);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see udem.pds.taller2.model.Folder#copy()
	 */
	@Override
	public void copy() {
		System.out.println("Copiando una carpeta Windows");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see udem.pds.taller2.model.Folder#delete()
	 */
	@Override
	public void delete() {
		System.out.println("Borrando una carpeta Windows");
	}

}
