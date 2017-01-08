import java.io.*;
import static java.lang.System.*;

public class FetchData {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			FileReader Fr= new FileReader("Creadit.txt");
			BufferedReader br= new BufferedReader(Fr);
			
			String str;
			while((str= br.readLine())!= null){
				out.println(str +"\n");
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			out.print("File Not Found");
		}

	}

}
