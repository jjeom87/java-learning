package org.sunj.tutorials.files.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZip {
	List<String> fileList;
	private static final String INPUT_ZIP_FILE = "D:/test/A0190302017042700001.zip";
	private static final String OUTPUT_FOLDER = "D:/test/A0190302017042700001";

	public static void main(String[] args) {
		UnZip unZip = new UnZip();
		unZip.unZipIt(INPUT_ZIP_FILE, OUTPUT_FOLDER);
	}

	/**
	 * Unzip it
	 * 
	 * @param zipFile input zip file
	 * @param output zip file output folder
	 */
	public void unZipIt(String zipFile, String outputFolder) {

		byte[] buffer = new byte[1024];

		try {

			//create output directory is not exists
			/*File folder = new File(OUTPUT_FOLDER);
			if (!folder.exists()) {
				folder.mkdir();
			}*/

			// get the zip file content
			ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFile), Charset.forName("EUC-KR"));
			// get the zipped file list entry
			ZipEntry ze = zis.getNextEntry();
			File newFile = null;
			while (ze != null) {
				String fileName = ze.getName();
				newFile = new File(outputFolder + File.separator + fileName);

				System.out.println("file unzip : " + newFile.getAbsoluteFile());

				//create all non exists folders
				//else you will hit FileNotFoundException for compressed folder
				new File(newFile.getParent()).mkdirs();

				FileOutputStream fos = new FileOutputStream(newFile);

				int len;
				while ((len = zis.read(buffer)) > 0) {
					fos.write(buffer, 0, len);
				}

				fos.close();
				ze = zis.getNextEntry();
			}

			zis.closeEntry();
			zis.close();
			
			System.out.println(newFile.isFile());
			System.out.println(newFile.getAbsolutePath());
			System.out.println(newFile.getParent());
			System.out.println(newFile.getAbsolutePath().substring(0, newFile.getAbsolutePath().lastIndexOf('.')) + ".pdf");
			
			System.out.println("Done");

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}

