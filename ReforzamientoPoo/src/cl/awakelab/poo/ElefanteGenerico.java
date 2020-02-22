package cl.awakelab.poo;

public class ElefanteGenerico extends MediosDeTransporte {
	
	private float kilosDePopo;
	
	
	public ElefanteGenerico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElefanteGenerico(float velocidadMaxima, float kilometrosPorLitro,
			int capacidadPasajeros, float autonomia, float kilosDePopo) {
		super(velocidadMaxima, kilometrosPorLitro, capacidadPasajeros, autonomia);
		this.kilosDePopo = kilosDePopo;
	}

	public float getKilosDePopo() {
		return kilosDePopo;
	}

	public void setKilosDePopo(float kilosDePopo) {
		this.kilosDePopo = kilosDePopo;
	}

	
}
