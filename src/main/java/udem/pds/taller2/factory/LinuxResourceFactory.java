/**
 * 
 */
package udem.pds.taller2.factory;

import java.util.Date;

import udem.pds.taller2.model.Resource;
import udem.pds.taller2.model.linux.LinuxFile;
import udem.pds.taller2.model.linux.LinuxFolder;

/**
 * Fábrica de recursos para Linux
 */
public class LinuxResourceFactory extends ResourceFactory {

	/**
	 * Contructor de la fábrica
	 */
	public LinuxResourceFactory() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see udem.pds.taller2.factory.ResourceFactory#getFileResource(java.lang.String, java.util.Date, java.lang.String)
	 */
	@Override
	public Resource getFileResource(String name, Date modificationDate, String type) {
		return new LinuxFile(name, modificationDate, type);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see udem.pds.taller2.factory.ResourceFactory#getFolderResource(java.lang.String, java.util.Date)
	 */
	@Override
	public Resource getFolderResource(String name, Date modificationDate) {
		return new LinuxFolder(name, modificationDate);
	}

}
