
import java.io.FileInputStream;

public class FileHandling {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("D:\\Finished7.txt");
			int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
            System.out.print((char)i);
            fin.close();  
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}