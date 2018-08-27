package net.netasystems.threads;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NS-388
 *
 */
public class Equipo implements Runnable {
	
	private List<Corredor> corredores;
	private String name;
	private Carrera carrera;
	private int pendientes = 10;
	public boolean done = false;
	
	/**
	 * Muestra que cual es el corredor que tiene la bandera
	 * @param carrera
	 * @param name
	 */
	public Equipo(Carrera carrera, String name){
		this.name = name;
		this.carrera = carrera;
		corredores = new ArrayList<>();
		for(int i = 0; i<pendientes; i++) {
			Corredor c = new Corredor(carrera, this.name +"_Corredor:"+ i, this);
			corredores.add(c);
		}
	}
	
	/**
	 * Se muestra el equipo que gano la carrera
	 */
	public void corredorTermina() {
		this.pendientes--;
		if(pendientes == 0) {
			System.out.println("El equipo: "+ this.name + " ha terminado!!!!");
			
		} 
		
		
	}

	/* 
	 * Se inicia la carrera
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("Equipo: "+ this.name + " ha iniciado!!!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(Corredor c : corredores) {
			Thread t = new Thread(c);
			t.start();
		}
		
	}

}
