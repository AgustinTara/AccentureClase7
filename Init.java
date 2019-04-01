package multas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.google.gson.Gson;

import sensorvelocidad.Patentes;
import sensorvelocidad.VehiculoData;

public class Init {
	public static void main(String[] args) throws Throwable {
		//ticket con datos de vehiculo + ID
		//cada multa es un archivo JSON
		//todas las multas se guardan en una misma carpeta
		//multa fija de $1000
		
		File f;
		Writer escritor;
		
		Ticket ticket;
		String id;
		Gson gson;
		
		while(true){
			
			gson= new Gson();
			id = java.util.UUID.randomUUID().toString();
			ticket= new Ticket(Patentes.sensarVehiculo());
			f= new File("C:\\clase7\\multas\\"+id+".json");
			escritor = new FileWriter(f, false);
			
//			escritor.write(id+ System.lineSeparator());
//			escritor.write(datosVehiculo.patente+ System.lineSeparator());
//			escritor.write(datosVehiculo.tipoVehiculo+ System.lineSeparator());
//			escritor.write(datosVehiculo.velocidadMedida+ System.lineSeparator());
//			escritor.write(datosVehiculo.limiteVelocidad+ System.lineSeparator());
			
//			System.out.println(datosVehiculo.patente);
//			System.out.println(datosVehiculo.tipoVehiculo);
//			System.out.println(datosVehiculo.velocidadMedida);
//			System.out.println(datosVehiculo.limiteVelocidad);
			
			escritor.write(gson.toJson(ticket));
			
			escritor.flush();
			escritor.close();
		}
		
	}
}
