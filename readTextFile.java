import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readTextFile {

  //  private static final

    public static void main(String[] args) {

		String filename = "C:/Users/kmkmadusanka/Downloads/sampleJSON.txt";
        readTextFile g = new readTextFile();

        g.readText(filename);

    }


    public String readText(String FILENAME){
		
		String finalOutput="";

        BufferedReader br = null;
        FileReader fr = null;

        try {

            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;
			
			
            while ((sCurrentLine = br.readLine()) != null) {
               // System.out.println(sCurrentLine);
			   finalOutput=finalOutput+sCurrentLine;
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
		
		System.out.println(finalOutput);
		return finalOutput;
		
		
    }
}
