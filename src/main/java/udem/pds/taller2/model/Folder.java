package udem.pds.taller2.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase que representa una carpeta de un sistema de archivos
 *
 */
public abstract class Folder extends Resource {

	/**
	 * Atributo que representa los hijos (Archivos o sub-carpeta) de la carpeta. Este atributo determina que una carpeta se compone de otros
	 * recursos. <b>Patr�n Composite</b>
	 */
	protected List<Resource> children;

	/**
	 * Constructor de una carpeta
	 * 
	 * @param name
	 *            - nombre del recurso
	 * @param modificationDate
	 *            - fecha de �ltima modificaci�n
	 */
	public Folder(String name, Date modificationDate) {
		super(name, modificationDate);
		this.children = new ArrayList<Resource>();
	}

	/**
	 * M�todo para copiar el recurso
	 */
	public abstract void copy();

	/**
	 * M�todo para eliminar el recurso
	 */
	public abstract void delete();
	
	/**
	 * @return the children
	 */
	public List<Resource> getChildren() {
		return this.children;
	}

}
