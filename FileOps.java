package creatfilename;
import java.io.File;
public class FileOps {
		static void createMainFolderIfNotPresent(){
			File fileObj = new File("C:\\Main");
			
			if(fileObj.exists()) {
				System.out.println("print welcome Screen");
			}	
			else
			{
				fileObj.mkdir();
				System.out.println("Lockers Pvt.ltd\n" +  "by Simnikiwe Mathimba\n" + " ");
			}
			
		}
}
