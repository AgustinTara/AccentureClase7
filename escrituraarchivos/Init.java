package escrituraarchivos;

import java.io.*;

public class Init {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\clase7\\archivo.txt");
        Writer escritor = new FileWriter(f, false);
        
        escritor.write("Esta es la linea uno" + System.lineSeparator());        
        escritor.write("Esta es la linea dos");
        
        escritor.flush();
        escritor.close();
    }
}
