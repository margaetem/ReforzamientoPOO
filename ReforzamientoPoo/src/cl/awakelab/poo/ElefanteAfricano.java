package cl.awakelab.poo;

public class ElefanteAfricano extends ElefanteGenerico {

	private int tamanoOreja;

	public int getTamanoOreja() {
		return tamanoOreja;
	}

	public void setTamanoOreja(int tamanoOreja) {
		this.tamanoOreja = tamanoOreja;
	}
	
	public void agitarOrejasHastaVolar() {
		System.out.println("Bajate de ahi dumbo!!");
	}
}
