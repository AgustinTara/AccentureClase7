package lecturaarchivos;

import java.io.*;

public class Init {
    public static void main(String[] args) throws Throwable {
        System.out.println(args[0]);
        File archivo = new File("c:\\clase7\\archivito.txt");
        Reader lector = new FileReader(archivo);
        BufferedReader lectorXLinea = new BufferedReader(lector);

        lector.read();
        for (String s = lectorXLinea.readLine(); s!=null; s = lectorXLinea.readLine()) {
            System.out.println(s);            
        }
    }
}
