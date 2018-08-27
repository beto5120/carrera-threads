package net.netasystems.threads;

public class Carrera {

	/**
	 * Se declara una variable boolena
	 */
	private boolean flagTaken = false;
	
	/**
	 * 
	 * Se toma la bandera
	 * @param threadName
	 * @return
	 */
	public synchronized boolean aquireFlag(String threadName) {
		if(flagTaken) {
			return false;
		}
		System.out.println("Flag has been aquired by: "+threadName);
		flagTaken = true;
		return true;
	}
	
	public void releaseFlag() {
		flagTaken = false;
	}
	
	public void releaserFloag() {
		flagTaken = true;
	}

	@Override
	public String toString() {
		return "Carrera [flagTaken=" + flagTaken + "]";
	}
	
}
