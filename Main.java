package net.netasystems.threads;

/**
 * @author NS-388
 *Se declaran los equipos para comenzar la carrera
 */
public class Main {
	
	public static void main(String[] args) {
		System.out.println("Carrera de Netasystems!!!!");
		Carrera carrera = new Carrera();
		Equipo eqAzul = new Equipo(carrera, "Azul");
		Equipo eqAmarillo = new Equipo(carrera, "Amarillo");
		Thread teqAz = new Thread(eqAzul);
		Thread teqAm = new Thread(eqAmarillo);
		teqAm.start();
		teqAz.start();
	}

}
