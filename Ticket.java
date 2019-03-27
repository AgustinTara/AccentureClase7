package multas;

import sensorvelocidad.VehiculoData;

public class Ticket {
	
	String id= java.util.UUID.randomUUID().toString();
	VehiculoData datosVehiculo;
	
	public Ticket(VehiculoData vd){
		this.datosVehiculo=vd;
	}

}
