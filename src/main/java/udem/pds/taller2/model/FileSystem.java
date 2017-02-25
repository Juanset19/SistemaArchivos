package udem.pds.taller2.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import udem.pds.taller2.factory.ResourceFactory;

/**
 * Clase que representa un sistema de archivos de un sistema operativo.
 *
 */
public class FileSystem {

	/**
	 * Recursos del sistema de archivos
	 */
	private List<Resource> resources;

	/**
	 * Fábrica de recursos
	 */
	private ResourceFactory fabrica;

	/**
	 * Constructor del sistema de archivos
	 */
	public FileSystem() {
		super();
		this.resources = new ArrayList<Resource>();
		getFactory();
	}

	/**
	 * Obtiene la fábrica correspondiente al sistema operativo
	 */
	private void getFactory() {
		this.fabrica = ResourceFactory.getFactory();
	}

	/**
	 * @return the resources
	 */
	public List<Resource> getResources() {
		return this.resources;
	}

	/**
	 * Añade un archivo al sistema de archivos
	 * 
	 * @param name
	 * @param modificationDate
	 * @param type
	 */
	public void addFile(String name, Date modificationDate, String type) {
		resources.add(this.fabrica.getFileResource(name, modificationDate, type));
	}

	/**
	 * Añade una carpeta al sistema de archivos
	 * 
	 * @param name
	 * @param modificationDate
	 */
	public void addFolder(String name, Date modificationDate) {
		resources.add(this.fabrica.getFolderResource(name, modificationDate));
	}
}
