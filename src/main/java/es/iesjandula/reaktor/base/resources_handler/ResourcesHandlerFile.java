package es.iesjandula.reaktor.base.resources_handler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.iesjandula.reaktor.base.utils.BaseConstants;
import es.iesjandula.reaktor.base.utils.BaseException;

/**
 * @author Francisco Manuel Benítez Chico
 */
public final class ResourcesHandlerFile extends ResourcesHandler
{
	/** Logger of the class */
	private static final Logger LOGGER = LoggerFactory.getLogger(ResourcesHandlerFile.class);

	/**
	 * @param resourceFolderUrl resource folder URL
	 */
	public ResourcesHandlerFile(URL resourceFolderUrl)
	{
		super(resourceFolderUrl);
	}

	/**
	 * @param destDir destination directory
	 */
	public void copyToDirectory(File destDir) throws BaseException
	{
		File srcDir = new File(getResourceFolderUrl().getFile());
		String absolutePathSrcDir = srcDir.getAbsolutePath();
		this.copyContentToWorkingDirectory(destDir, srcDir, absolutePathSrcDir);
	}

	private void copyContentToWorkingDirectory(File destDir, File srcDir, String absolutePathSrcDir) throws BaseException
	{
		File[] filesList = srcDir.listFiles();
		if (filesList != null)
		{
			for (File file : filesList)
			{
				String subfolderFile = file.getAbsolutePath().replace(absolutePathSrcDir, "");
				this.createFileOrDirectory(destDir, absolutePathSrcDir, file, subfolderFile);
			}
		}
	}

	private void createFileOrDirectory(File destDir, String absolutePathSrcDir, File foundFileDir, String subfolderFile) throws BaseException
	{
		if (foundFileDir.isDirectory())
		{
			this.createDirectoryIfNotExists(destDir, subfolderFile);
			this.copyContentToWorkingDirectory(destDir, foundFileDir, absolutePathSrcDir);
		}
		else
		{
			String filePathWithoutExtraInfo = getFileSubPathWithoutExtraInfoFromFullPath(subfolderFile);
			if (filePathWithoutExtraInfo != null)
			{
				FileInputStream fileInputStream = null;
				try
				{
					fileInputStream = new FileInputStream(foundFileDir);
					this.createFile(destDir, fileInputStream, filePathWithoutExtraInfo);
				}
				catch (IOException ioException)
				{
					String errorString = "IOException while getting an input stream from the file " + foundFileDir.getAbsolutePath();
					LOGGER.error(errorString, ioException);
					
					throw new BaseException(BaseConstants.EXC_ERR_CODE_RESOURCES_HANDLER, errorString, ioException);
				}
				finally
				{
					this.closeStream(fileInputStream);
				}
			}
		}
	}

	protected String getSeparator()
	{
		return File.separator;
	}
}
