package lecturasi;

import java.io.*;

public class Init {
    public static void main(String[] args) throws Throwable {
        Reader lector = new InputStreamReader(System.in);
        BufferedReader lectorXLinea = new BufferedReader(lector);

        int x = 1;
        for (String s = lectorXLinea.readLine(); s!=null; s = lectorXLinea.readLine()) {
            System.out.println((++x) + ">>  " + s);
        }
    }
}
