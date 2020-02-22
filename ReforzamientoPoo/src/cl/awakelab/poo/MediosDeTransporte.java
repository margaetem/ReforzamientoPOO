package cl.awakelab.poo;

public class MediosDeTransporte {
	
	private float velocidadMaxima;
	private float kilometrosPorLitro;
	private int capacidadPasajeros;
	private float autonomia;
	
	public MediosDeTransporte() {
		
	}
	
	
	public MediosDeTransporte(float velocidadMaxima, float kilometrosPorLitro, int capacidadPasajeros,
			float autonomia) {
		super();
		this.velocidadMaxima = velocidadMaxima;
		this.kilometrosPorLitro = kilometrosPorLitro;
		this.capacidadPasajeros = capacidadPasajeros;
		this.autonomia = autonomia;
	}
	public void avanzar() {
		System.out.println("Estoy avanzando");
		
	}
	public void frenar() {
		System.out.println("Estoy deteniendome");
		
	}
	public void chocar() {
		System.out.println("Tienes seguro?");
		
	}
	
	
	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public float getKilometrosPorLitro() {
		return kilometrosPorLitro;
	}
	public void setKilometrosPorLitro(float kilometrosPorLitro) {
		this.kilometrosPorLitro = kilometrosPorLitro;
	}
	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}
	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}
	public float getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(float autonomia) {
		this.autonomia = autonomia;
	}
	
	
}
