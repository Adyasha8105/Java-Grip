import java.io.*;
public class ReplaceText {	
  public static void main(String[] args) {
	  String filePath=args[0];
	  String oldString=null;
	  String newString=args[1];
		File fileToBeModified = new File(filePath);
		String oldContent = "";
		BufferedReader reader = null;
		FileWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader(fileToBeModified));
			String line = reader.readLine();
			oldString=line;
			while (line != null) 
			{
				oldContent = oldContent + line + System.lineSeparator();
				line = reader.readLine();
			}
			String newContent = oldContent.replaceAll(oldString, newString);
			writer = new FileWriter(fileToBeModified);
			writer.write(newContent);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
				writer.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
