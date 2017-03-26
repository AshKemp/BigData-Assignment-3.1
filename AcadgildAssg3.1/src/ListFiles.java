import java.io.*;

public class ListFiles {
	public void checkNoOfFiles (String filename) throws IOException {

	    File dir=new File(filename);
	    File files[]=dir.listFiles();//files array stores the list of files

	 for(int i=0;i<files.length;i++)
	    {
	        if(files[i].isFile()) //check whether files[i] is file or directory
	        {
	            System.out.println("File::"+files[i].getName());
	            System.out.println();

	        }
	        else if(files[i].isDirectory())
	        {
	            System.out.println("Directory::"+files[i].getName());
	            System.out.println();
	            checkNoOfFiles(files[i].getAbsolutePath());
	        }
	    }
	}

	public static void main(String[] args) throws IOException {

	    ListFiles mf=new ListFiles();
	    String str="/home/acadgild/hadoop"; 
	    mf.checkNoOfFiles(str);
	   }
	}
