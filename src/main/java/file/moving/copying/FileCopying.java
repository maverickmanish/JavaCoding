package file.moving.copying;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.common.io.Files;

public class FileCopying {

	private static final String IN_PATH = "d:/Profiles/mabhardwaj/Desktop/source/";
	private static final String OUT_PATH = "d:/Profiles/mabhardwaj/Desktop/destination/";
	public static void main(String[] args) {
		File Folder = new File(IN_PATH);
		File files[];
		files = Folder.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				if (name.toLowerCase().endsWith(".csv"))
					return true;
				else
					return false;
			}
		});
		for (File file : files) {
			System.out.println("file name :" + file.getName() + " file absolute Path :" + file.getAbsolutePath());
			Path des = Paths.get(OUT_PATH + file.getName());
			try {
				Files.copy(file, des.toFile());
				System.out.println("file copied successfully ");
			} catch (IOException e) {
				System.out.println("Not able to copy file" + file.getName());
				e.printStackTrace();
			}
		}

	}
}
