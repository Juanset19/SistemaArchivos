/**
 * 
 */
package udem.pds.taller2.factory;

import java.util.Date;

import udem.pds.taller2.model.Resource;
import udem.pds.taller2.model.windows.WindowsFile;
import udem.pds.taller2.model.windows.WindowsFolder;

/**
 * Fábrica de recursos para Windows
 */
public class WindowsResourceFactory extends ResourceFactory {

	/**
	 * Contructor de la fábrica
	 */
	public WindowsResourceFactory() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see udem.pds.taller2.factory.ResourceFactory#getFileResource(java.lang.String, java.util.Date, java.lang.String)
	 */
	@Override
	public Resource getFileResource(String name, Date modificationDate, String type) {
		return new WindowsFile(name, modificationDate, type);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see udem.pds.taller2.factory.ResourceFactory#getFolderResource(java.lang.String, java.util.Date)
	 */
	@Override
	public Resource getFolderResource(String name, Date modificationDate) {
		return new WindowsFolder(name, modificationDate);
	}

}
