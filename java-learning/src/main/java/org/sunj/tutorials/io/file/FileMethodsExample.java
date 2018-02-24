package org.sunj.tutorials.io.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileMethodsExample {

	public static void main(String[] args) throws Exception {
		String workingDir = System.getProperty("user.dir");
		System.out.println("workingDir : " + workingDir);
		System.out.println("========== file1 newfile1.txt ==========");
		File file = new File(workingDir + File.separator + "newfile1.txt");
		System.out.println("file.createNewFile() : " + file.createNewFile());
		fileMethodsExcute(file);
		
		System.out.println("\n========== file2 newfile2.txt ==========");
		File file2 = new File("newfile2.txt"); // 기본적으로 위에 user.dir에 생성된다.
		System.out.println("file2.createNewFile() : " + file2.createNewFile());
		fileMethodsExcute(file2);

		System.out.println("\n========== file3 d:/test2/test/a dir ==========");
		File file3 = new File("d:/test2/test/a"); // 기본적으로 위에 user.dir에 생성된다.
		System.out.println("file3.mkdirs() : " + file3.mkdirs());
		fileMethodsExcute(file3);

		System.out.println("\n========== file4 d:/test2/test/a/System.currentTimeMillis ==========");
		File file4 = new File(file3, String.valueOf(System.currentTimeMillis()));
		System.out.println("file4.mkdir() : " + file4.mkdir());
		fileMethodsExcute(file4);
		
	}
	
	public static void fileMethodsExcute(File file) {
		try {
			System.out.println("file.canExecute() : " + file.canExecute());
			System.out.println("file.canRead() : " + file.canRead());
			System.out.println("file.canWrite() : " + file.canWrite());
			// System.out.println("file.delete() : " + file.delete());
			System.out.println("file.exists() : " + file.exists());
			System.out.println("file.getAbsoluteFile() : " + file.getAbsoluteFile());
			System.out.println("file.getAbsolutePath() : " + file.getAbsolutePath());
			System.out.println("file.getCanonicalFile() : " + file.getCanonicalFile());
			System.out.println("file.getCanonicalPath() : " + file.getCanonicalPath());
			System.out.println("file.getFreeSpace() : " + file.getFreeSpace());
			System.out.println("file.getName() : " + file.getName());
			System.out.println("file.getParent() : " + file.getParent());
			System.out.println("file.getParentFile() : " + file.getParentFile());
			System.out.println("file.getPath() : " + file.getPath());
			System.out.println("file.getTotalSpace() : " + file.getTotalSpace());
			System.out.println("file.getUsableSpace() : " + file.getUsableSpace());
			System.out.println("file.hashCode() : " + file.hashCode());
			System.out.println("file.isAbsolute() : " + file.isAbsolute());
			System.out.println("file.isDirectory() : " + file.isDirectory()); // 생성되어져 있어야 한다.
			System.out.println("file.isFile() : " + file.isFile()); // 생성되어져 있어야 한다.
			System.out.println("file.isHidden() : " + file.isHidden());
			System.out.println("file.lastModified() : " + file.lastModified());
			String[] list = file.list();
			System.out.println("list : " + list);
			if (list != null) {
				System.out.println("list.length : " + list.length);
				for (String path : list) {
					System.out.println("list path : " + path);
				}
			}

			String[] listByFilenameFilter = file.list(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					return false;
				}
			});

			System.out.println("listByFilenameFilter : " + listByFilenameFilter);
			if (listByFilenameFilter != null) {
				System.out.println("listByFilenameFilter.length : " + listByFilenameFilter.length);
				for (String path : listByFilenameFilter) {
					System.out.println("list path : " + path);
				}
			}

			File[] fileList = file.listFiles();
			System.out.println("fileList : " + fileList);
			if (fileList != null) {
				System.out.println("fileList.length : " + fileList.length);
				for (File f : fileList) {
					System.out.println("fileList file : " + f);
				}
			}

			File[] fileListByFileFilter = file.listFiles(new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					// TODO Auto-generated method stub
					return false;
				}
			});

			System.out.println("fileListByFileFilter : " + fileListByFileFilter);
			if (fileListByFileFilter != null) {
				System.out.println("fileListByFileFilter.length : " + fileListByFileFilter.length);
				for (File f : fileListByFileFilter) {
					System.out.println("fileListByFileFilter file : " + f);
				}
			}

			File[] fileListByFilenameFilter = file.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					return false;
				}
			});

			System.out.println("fileListByFilenameFilter : " + fileListByFileFilter);
			if (fileListByFilenameFilter != null) {
				System.out.println("fileListByFilenameFilter.length : " + fileListByFilenameFilter.length);
				for (File f : fileListByFilenameFilter) {
					System.out.println("fileListByFilenameFilter file : " + f);
				}
			}

			File[] rootFileList = File.listRoots();
			System.out.println("rootFileList : " + rootFileList);
			if (rootFileList != null) {
				System.out.println("rootFileList.length : " + rootFileList.length);
				for (File f : rootFileList) {
					System.out.println("rootFileList file : " + f);
				}
			}

			System.out.println("file.mkdir() : " + file.mkdir());
			System.out.println("file.mkdirs() : " + file.mkdirs());
			System.out.println("file.renameTo() : " + file.renameTo(new File("aaa.txt")));
			System.out.println("file.setExecutable(false) : " + file.setExecutable(false));
			System.out.println("file.setExecutable(false, true) : " + file.setExecutable(false, true));
			System.out.println("file.setLastModified(System.currentTimeMillis() : "
					+ file.setLastModified(System.currentTimeMillis()));
			System.out.println("file.setReadable(false) : " + file.setReadable(false));
			System.out.println("file.setReadable(false, true) : " + file.setReadable(false, true));
			System.out.println("file.setReadOnly() : " + file.setReadOnly());
			System.out.println("file.setWritable(false) : " + file.setWritable(false));
			System.out.println("file.setWritable(false, true) : " + file.setWritable(false, true));
			System.out.println("file.toPath() : " + file.toPath());
			System.out.println("file.toString() : " + file.toString());
			System.out.println("file.toURI() : " + file.toURI());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
