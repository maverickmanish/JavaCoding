package file.moving.copying;

import java.io.File;
import java.io.FilenameFilter;

public class FileMoving {

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
			System.out.println("file name :" + file.getName());
			if (file.renameTo(new File(OUT_PATH + file.getName()))) {		
				System.out.println("File moved Successfully !!!");
			} else {
				System.out.println("Unable to move file ");
			}
		}

	}
}
