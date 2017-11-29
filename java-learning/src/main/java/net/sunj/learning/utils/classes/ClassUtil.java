package net.sunj.learning.utils.classes;

import java.io.File;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ClassUtil {
	
	public static void main(String[] args) {
		try{
			HashSet setClasses = (HashSet) ClassUtil.getClasses("samples.classes");
			Iterator setClassesIter = setClasses.iterator();
			while(setClassesIter.hasNext()) {
				Class c = (Class) setClassesIter.next();
				System.out.println(c.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Set<Class> getClasses(String packageName) throws Exception {
		Set<Class> classes = new HashSet<Class>();
		String packageNameSlash = "./" + packageName.replace(".", "/");
		URL directoryURL = Thread.currentThread().getContextClassLoader().getResource(packageNameSlash);
		if (directoryURL == null) {
			System.err.println("Could not retrive URL resource : " + packageNameSlash);
			return null;
		}

		String directoryString = directoryURL.getFile();
		if (directoryString == null) {
			System.err.println("Could not find directory for URL resource : " + packageNameSlash);
			return null;
		}

		File directory = new File(directoryString);
		if (directory.exists()) {
			String[] files = directory.list();
			for (String fileName : files) {
				if (fileName.endsWith(".class")) {
					fileName = fileName.substring(0, fileName.length() - 6); // remove .class
					try {
						Class c = Class.forName(packageName + "." + fileName);
						if (!Modifier.isAbstract(c.getModifiers())) // add a class which is not abstract
						classes.add(c);
					} catch (ClassNotFoundException e) {
						System.err.println(packageName + "." + fileName + " does not appear to be a valid class");
						e.printStackTrace();
					}
				}
			}
		} else {
			System.err.println(packageName + " does not appear to exist as a valid package on the file system.");
		}

		return classes;
	}

}
